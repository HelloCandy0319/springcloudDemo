package com.example.redisdemo.untils;

import com.example.redisdemo.RedisConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 有问题
 */
public class JedisUntils {

    private RedisConfig redisConfig;

    private static JedisPool jedisPool = null;

    public   Jedis getJedisPool(){
        if (jedisPool==null){
            initJedisPool();
        }
        return jedisPool.getResource();
    }

    public static void closeJedis(Jedis jedis) {
        jedis.close();
        jedisPool.close();

    }

    private  void initJedisPool(){
        JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxIdle(Integer.parseInt(redisConfig.getMaxIdle()));
        poolConfig.setMinIdle(Integer.parseInt(redisConfig.getMinIdle()));
         jedisPool = new JedisPool(poolConfig,redisConfig.getHost(),Integer.parseInt(redisConfig.getPort()));
    }
}
