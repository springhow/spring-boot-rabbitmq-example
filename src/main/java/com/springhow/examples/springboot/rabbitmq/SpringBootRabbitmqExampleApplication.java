package com.springhow.examples.springboot.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootRabbitmqExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRabbitmqExampleApplication.class, args);
    }

}
