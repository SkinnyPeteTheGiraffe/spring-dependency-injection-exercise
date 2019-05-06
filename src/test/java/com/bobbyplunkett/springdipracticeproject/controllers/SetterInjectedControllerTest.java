package com.bobbyplunkett.springdipracticeproject.controllers;

import com.bobbyplunkett.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * com.bobbyplunkett.springdipracticeproject.controllers
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 10:07 PM
 */
public class SetterInjectedControllerTest {
    private SetterInjectedController getterInjectedController;

    @Before
    public void setUp() throws Exception {
        this.getterInjectedController = new SetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, getterInjectedController.sayHello());
    }
}