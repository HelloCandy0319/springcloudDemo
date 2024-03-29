package com.example.customer_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(CustomerDemo2Application.class, args);
    }

}
