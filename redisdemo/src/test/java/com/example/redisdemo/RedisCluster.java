package com.example.redisdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisCluster {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Test
    public void testCluster() throws Exception{
        Set<HostAndPort> hostAndPortSet = new HashSet<>();
        hostAndPortSet.add(new HostAndPort("192.168.80.128",7010));
        hostAndPortSet.add(new HostAndPort("192.168.80.128",7011));
        hostAndPortSet.add(new HostAndPort("192.168.80.128",7012));
        hostAndPortSet.add(new HostAndPort("192.168.80.128",7013));
        hostAndPortSet.add(new HostAndPort("192.168.80.128",7014));
        hostAndPortSet.add(new HostAndPort("192.168.80.128",7015));
        JedisCluster jedisCluster = new JedisCluster(hostAndPortSet);
        jedisCluster.set("test","123");
        System.out.println(jedisCluster.get("test"));
        jedisCluster.close();
    }




    @Test
    public void testRedisTemplate(){
        redisTemplate.opsForValue().set("name","Cindy");
        System.out.println("测试结果："+redisTemplate.opsForValue().get("name"));
    }

}
