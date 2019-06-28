package com.example.mq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestTopic {
    @Test
    public void testTopicProducer() throws Exception{
        String TCPUrl = "tcp://127.0.0.1:61616";
        String username = "admin";
        String password = "admin";
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(username,password,TCPUrl);
        Connection connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("testTopic");
        MessageProducer producer = session.createProducer(topic);
        TextMessage message = session.createTextMessage("This is topicMessage");
        producer.send(message);
        producer.close();
        session.close();
        connection.close();
    }

    @Test
    public void testTopicCustomer() throws Exception{
        String TCPUrl = "tcp://127.0.0.1:61616";
        String username = "admin";
        String password = "admin";
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(username,password,TCPUrl);
        Connection connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Topic topic = session.createTopic("testTopic");
        MessageConsumer consumer = session.createConsumer(topic);
        consumer.setMessageListener(message -> {
            try {
                TextMessage textMessage = (TextMessage) message;
                System.out.println(textMessage.getText());
            }catch (Exception e){
                e.printStackTrace();
            }
        });
        System.in.close();
        consumer.close();
        session.close();
        connection.close();
    }
}
