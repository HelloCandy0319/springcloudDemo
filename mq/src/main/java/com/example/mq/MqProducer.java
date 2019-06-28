package com.example.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

/**
 * ActiveMQ服务提供
 * @author jitwxs
 * @since 2018/5/8 16:56
 */
@Component
public class MqProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    /**
     * 即时发送
     * @param message 内容，一般为JSON
     * @author jitwxs
     * @since 2018/5/8 21:08
     */
    public void send(Destination destination, String message){
        jmsMessagingTemplate.convertAndSend(destination,message);
    }
}
