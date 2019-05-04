package com.bobbyplunkett.springdipracticeproject.services.impl;

import com.bobbyplunkett.springdipracticeproject.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * com.bobbyplunkett.springdipracticeproject.services.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/4/2019
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - From Primary Greeting Service";
    }
}
