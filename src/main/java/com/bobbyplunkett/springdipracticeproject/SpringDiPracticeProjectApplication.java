package com.bobbyplunkett.springdipracticeproject;

import com.bobbyplunkett.springdipracticeproject.controllers.ConstructorInjectedController;
import com.bobbyplunkett.springdipracticeproject.controllers.MyController;
import com.bobbyplunkett.springdipracticeproject.controllers.PropertyInjectedController;
import com.bobbyplunkett.springdipracticeproject.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiPracticeProjectApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringDiPracticeProjectApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        // Test Primary Service
        System.out.println(controller.sayGreeting());

        // Test DI Controllers
        System.out.printf("[%s]: %s\n", PropertyInjectedController.class.getSimpleName(), ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.printf("[%s]: %s\n", SetterInjectedController.class.getSimpleName(), ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.printf("[%s]: %s\n", ConstructorInjectedController.class.getSimpleName(), ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
