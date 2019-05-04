package com.bobbyplunkett.springdipracticeproject.services.impl;

import com.bobbyplunkett.springdipracticeproject.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * com.bobbyplunkett.springdipracticeproject.services.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/4/2019
 */
@Service
@Profile("nl")
@Primary
public class PrimaryDutchGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hallo - Van Primary Greeting Service!";
    }
}
