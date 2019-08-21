package com.example.heroku;

import com.example.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class launches the web application in an embedded Jetty container. This is the entry point to your application. The Java
 * command that is used for launching should fire this main method.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = GreetingController.class)

public class Main {

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Main.class, args);

    }
}
