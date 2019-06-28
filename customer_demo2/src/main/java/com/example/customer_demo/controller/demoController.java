package com.example.customer_demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/CustomerDemo2")
public class demoController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/hi")
    public String sayHi(){
        return port+": "+"Say Hi To CustomerDemo2!";
    }
}
