package com.example.caller.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CallerDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(CallerDemo1Application.class, args);
    }

}
