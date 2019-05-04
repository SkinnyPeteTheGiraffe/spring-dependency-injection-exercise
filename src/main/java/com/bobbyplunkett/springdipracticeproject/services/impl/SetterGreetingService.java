package com.bobbyplunkett.springdipracticeproject.services.impl;

import com.bobbyplunkett.springdipracticeproject.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * com.bobbyplunkett.springdipracticeproject.services.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/4/2019
 */
@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was injected by Setter!";
    }
}
