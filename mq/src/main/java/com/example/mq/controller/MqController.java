package com.example.mq.controller;

import com.example.mq.MqProducer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

@RestController
public class MqController {
    @Autowired
    private MqProducer mqProducer;

    @GetMapping("/send/{info}")
    public void sendQueue(@PathVariable String info){
        Destination destination = new ActiveMQQueue("SpringBootTestQueue");
        mqProducer.send(destination,info);
    }
}