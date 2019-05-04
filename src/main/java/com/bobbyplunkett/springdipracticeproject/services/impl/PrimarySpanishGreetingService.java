package com.bobbyplunkett.springdipracticeproject.services.impl;

import com.bobbyplunkett.springdipracticeproject.components.GreetingComponent;
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
@Profile("es")
@Primary
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingComponent greetingComponentImpl;

    public PrimarySpanishGreetingService(GreetingComponent greetingComponentImpl) {
        this.greetingComponentImpl = greetingComponentImpl;
    }

    @Override
    public String sayGreeting() {
        return greetingComponentImpl.getSpanishGreeting();
    }
}
