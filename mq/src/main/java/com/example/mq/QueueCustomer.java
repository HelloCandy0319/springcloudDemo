package com.example.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueCustomer {
    @JmsListener(destination = "SpringBootTestQueue")
    public void receiveQueue(String text){
        System.out.println("接收到的文本信息是："+text);
    }
}

