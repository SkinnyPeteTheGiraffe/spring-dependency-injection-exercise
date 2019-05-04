package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.springdipracticeproject.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * com.bobbyplunkett.springdipracticeproject.controllers
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 10:05 PM
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
    }
}