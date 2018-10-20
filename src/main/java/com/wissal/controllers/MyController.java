package com.wissal.controllers;

import com.wissal.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String hello(){

        return greetingService.sayGreeting();
    }
}
