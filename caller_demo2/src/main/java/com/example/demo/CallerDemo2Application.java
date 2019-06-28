package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CallerDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(CallerDemo2Application.class, args);
    }

}
