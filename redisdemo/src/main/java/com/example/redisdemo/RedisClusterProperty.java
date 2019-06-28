package com.example.redisdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@Validated
@Data
@ConfigurationProperties(value = "spring.redis.cluster")
@PropertySource(value = "classpath:redisCluster.properties")
public class RedisClusterProperty {
    private List<String> nodes;
    /**
     * 获取连接的超时时间
     */
    private Integer timeout;
    /**
     * 最大连接尝试次数
     */
    private Integer maxAttempts;

}
