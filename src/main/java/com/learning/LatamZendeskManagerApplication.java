package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.learning")
public class LatamZendeskManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LatamZendeskManagerApplication.class, args);
    }
}

