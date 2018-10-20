package com.wissal;

import com.wissal.controllers.MyController;
import com.wissal.examplebeans.FakeDataSource;
import com.wissal.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(DiDemoApplication.class,args);

        FakeDataSource fakeDataSource=(FakeDataSource)context.getBean(FakeDataSource.class);


        System.out.println(fakeDataSource.getName());

        FakeJmsBroker fakeJmsBroker=(FakeJmsBroker)context.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUserName());

    }
}
