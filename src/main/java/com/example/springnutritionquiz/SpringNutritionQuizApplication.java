package com.example.springnutritionquiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringNutritionQuizApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringNutritionQuizApplication.class, args);
    }

}
