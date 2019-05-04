package com.bobbyplunkett.springdipracticeproject.controllers;

import org.springframework.stereotype.Controller;

/**
 * A basic controller object.
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 05/03/2019
 */
@Controller
public class MyController {

    public String printHelloWorld() {
        String helloWorld = "Hello World";
        System.out.println(helloWorld);
        return helloWorld;
    }
}
