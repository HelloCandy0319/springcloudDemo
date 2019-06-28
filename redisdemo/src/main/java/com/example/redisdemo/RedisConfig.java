package com.example.redisdemo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:application.yml"})
@Data
public class RedisConfig {
    @Value("${spring.redis.host}")
    private  String host;
    @Value("${spring.redis.port}")
    private  String port;
    @Value("${spring.redis.jedis.pool.min-idle}")
    private   String minIdle;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private  String maxIdle;


}
