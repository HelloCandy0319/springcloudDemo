package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "/index";
    }

    @GetMapping("/login")
    public String login(){
        System.out.println("loginPage");
        return "/loginPage";
    }

    @GetMapping("/register")
    public String register() {
        System.out.println("register");
        return "/registerPage";
    }

    @GetMapping("/error")
    public String error() {
        System.out.println("error");
        return "/error";
    }
    @GetMapping("/login/invalid")
    @ResponseBody
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String invalid(){
        return "Session过期，请重新登录！";
    }

}
