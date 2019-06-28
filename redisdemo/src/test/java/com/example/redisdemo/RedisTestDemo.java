package com.example.redisdemo;

import com.example.redisdemo.untils.JedisUntils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTestDemo {
    @Test
    public void insertInfoToRedis(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMinIdle(10);
        jedisPoolConfig.setMaxIdle(50);
        jedisPoolConfig.setMaxTotal(50);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,"localhost",6379);
        Jedis jedis = null;
        try {
          jedis = jedisPool.getResource();
          jedis.set("age","20");
          System.out.println(jedis.get("age"));
      }catch (Exception e){
          e.printStackTrace();
      }finally {
          jedis.close();
      }
        jedisPool.close();
    }

    @Test
    public void testJedisUntils(){
        Jedis jedis = null;
        JedisUntils jedisUntils = new JedisUntils();
        try {
             jedis = jedisUntils.getJedisPool();
             jedis.set("age","22");
             System.out.println(jedis.get("age"));
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JedisUntils.closeJedis(jedis);
        }
    }






}
