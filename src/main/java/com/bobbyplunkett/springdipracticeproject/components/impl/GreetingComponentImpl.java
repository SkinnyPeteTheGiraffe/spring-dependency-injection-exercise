package com.bobbyplunkett.springdipracticeproject.components.impl;

import com.bobbyplunkett.springdipracticeproject.components.GreetingComponent;
import org.springframework.stereotype.Component;

/**
 * com.bobbyplunkett.springdipracticeproject.components.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/4/2019
 */
@Component
public class GreetingComponentImpl implements GreetingComponent {

    @Override
    public String getEnglishGreeting() {
        return "Hello - From Primary Greeting Service!";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola - Del Servicio De Saludo Primario!";
    }

    @Override
    public String getDutchGreeting() {

        return "Hallo - Van Primary Greeting Service!";

    }
}
