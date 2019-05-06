package com.bobbyplunkett.services.impl;

import com.bobbyplunkett.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * com.bobbyplunkett.springdipracticeproject.services.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 05/03/2019
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_WORLD = "Hello World!";

    @Override
    public String sayGreeting() {
        return HELLO_WORLD;
    }
}
