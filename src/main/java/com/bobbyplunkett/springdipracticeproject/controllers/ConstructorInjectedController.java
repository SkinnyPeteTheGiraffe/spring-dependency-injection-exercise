package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Constructor Injection Controller (Most Preferred)
 * Constructor Dependency Injection is automatically wired in Spring v4.2+ therefore
 * no need for {@link Autowired} though can be kept in place for better readability
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 05/03/2019
 */
@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    @Autowired // Optional, but helpful
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
