package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.springdipracticeproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Property Injection Controller (Things NOT To Do)
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 05/03/2019
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingServiceImpl; // Can use name in placement of a qualifier in some cases (as in this case)

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
