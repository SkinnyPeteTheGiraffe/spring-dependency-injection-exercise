package com.bobbyplunkett.services.impl;

import com.bobbyplunkett.services.GreetingService;
import com.bobbyplunkett.springdipracticeproject.components.GreetingComponent;
import org.springframework.beans.factory.annotation.Autowired;
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
@Profile({"en", "default"})
@Primary
public class PrimaryGreetingService implements GreetingService {

    private GreetingComponent greetingComponentImpl;

    @Autowired
    public PrimaryGreetingService(GreetingComponent greetingComponentImpl) {
        this.greetingComponentImpl = greetingComponentImpl;
    }

    @Override
    public String sayGreeting() {
        return greetingComponentImpl.getEnglishGreeting();
    }
}
