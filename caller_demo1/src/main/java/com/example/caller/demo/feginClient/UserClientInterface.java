package com.example.caller.demo.feginClient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("customerDemo1")
public interface UserClientInterface {
    @RequestMapping(value = "/customerDemo1/hi",method = RequestMethod.GET)
    public String sayHi();


}
