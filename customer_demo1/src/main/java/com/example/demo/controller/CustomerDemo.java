package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerDemo1")
public class CustomerDemo {
    @GetMapping("/hi")
    public String  sayHi(){
        return "Say Hi";
    }

}

