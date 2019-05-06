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
 * @since 10:06 PM
 */
public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_WORLD, propertyInjectedController.sayHello());
    }
}