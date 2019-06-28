package com.example.redisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class RedisClusterConfig {
    @Autowired
    private RedisClusterProperty redisClusterProperty;

    @Bean
    @Primary
    public RedisConnectionFactory connectionFactory(){
        RedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory(new RedisClusterConfiguration(redisClusterProperty.getNodes()));
        return redisConnectionFactory;
    }
}
