package com.example.caller.demo.controller;

import com.example.caller.demo.feginClient.UserClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserClient {
  @Value("${server.port}")
  private String port;

  @Autowired
  UserClientInterface userClientInterface;

  @GetMapping("/hi")
  public String sayHi(){
    return port+"::"+userClientInterface.sayHi();
  }
  @GetMapping("/hi1")
  public String sayH1i(){
    return port+"AAA"+userClientInterface.sayHi();
  }





}
