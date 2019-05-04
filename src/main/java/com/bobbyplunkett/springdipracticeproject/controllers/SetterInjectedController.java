package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.springdipracticeproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Setter Injection Controller (Up For Debate On Usage)
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 05/03/2019
 */
@Controller
public class SetterInjectedController {
    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
