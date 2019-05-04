package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.springdipracticeproject.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; // Can use name in placement of a qualifier in some cases (not in this case as we have set a @Primary service)

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
