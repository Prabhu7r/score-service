package com.scoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(scanBasePackages = {"com.scoreservice", "com.scoreservice.controller"})
public class ScoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScoreServiceApplication.class, args);
    }

}
