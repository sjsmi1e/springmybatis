package com.smile.test;

import com.smile.pojo.Userpojo;
import com.smile.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-02-10 14:15
 **/
public class RedisTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //JedisCluster jedisCluster= (JedisCluster) ac.getBean("redisCluster");
        JedisCluster jedisCluster=ac.getBean("redisCluster",JedisCluster.class);
        System.out.println(jedisCluster.get("name2"));
        jedisCluster.close();
    }
}
