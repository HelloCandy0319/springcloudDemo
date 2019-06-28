package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/doRegister")
    public String register(User user) {
        userService.register(user);
        return user == null ? "注册失败" : "注册成功";
    }

    @GetMapping("/me")
    public Object me(@AuthenticationPrincipal UserDetails userDetails){
        return userDetails;
    }

}
