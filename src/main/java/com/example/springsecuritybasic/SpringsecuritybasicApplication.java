package com.example.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

@SpringBootApplication
public class SpringsecuritybasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritybasicApplication.class, args);

    }
}
