package com.wissal;

import com.wissal.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(DiDemoApplication.class,args);

        MyController controller=(MyController)context.getBean("myController");
        System.out.println(controller.hello());
    }
}
