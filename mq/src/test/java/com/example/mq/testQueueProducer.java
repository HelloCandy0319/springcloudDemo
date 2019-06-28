package com.example.mq;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testQueueProducer{
    @Test
   public void QueueProducer() throws Exception{
       String TCPUrl = "tcp://127.0.0.1:61616";
       String username = "admin";
       String password = "admin";
       ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(username,password,TCPUrl);
       Connection connection = connectionFactory.createConnection();
       connection.start();
       // 参数1：是否开启事务，如果为true，参数2无效
       // 参数2：应答模式，自动应答/手动应答，一般自动应答即可
       Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
       Queue queue = session.createQueue("testQueue");
       //5、使用Session对象创建Destination对象（实现类：queue或topic）
       MessageProducer producer = session.createProducer(queue);
       //7、创建Message对象
       TextMessage message = session.createTextMessage("helloWord");
       producer.send(message);
       producer.close();
       session.close();
       connection.close();
   }
    @Test
   public void testQueueCustomer() throws Exception{
       String TCPUrl = "tcp://127.0.0.1:61616";
       String username = "admin";
       String password = "admin";
       ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(username,password,TCPUrl);
       Connection connection = connectionFactory.createConnection();
       connection.start();
       // 参数1：是否开启事务，如果为true，参数2无效
       // 参数2：应答模式，自动应答/手动应答，一般自动应答即可
       Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
       Queue queue = session.createQueue("testQueue");
       MessageConsumer consumer = session.createConsumer(queue);
       consumer.setMessageListener(message -> {
          try{
              TextMessage textMessage = (TextMessage) message;
              System.out.println(textMessage.getText());
          }catch (Exception e){
              e.printStackTrace();
          }
       });
   }


}
