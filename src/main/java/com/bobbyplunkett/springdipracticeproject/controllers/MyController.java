package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * A basic controller object.
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 05/03/2019
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
