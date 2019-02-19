package com.smile.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.smile.mapper.RedisMapper;
import com.smile.mapper.UserMapper;
import com.smile.pojo.Imgpojo;
import com.smile.util.JsonUtil;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-02-11 15:04
 **/
@Service
public class RedisService implements RedisMapper {
    @Resource
    JedisCluster credisCluster;
    @Resource
    UserMapper userMapper;

    @Override
    public boolean isExists(String key) {
        return credisCluster.exists(key);
    }

    @Override
    public List<Imgpojo> getAll() {
        //此处用于redis图片缓存
        List<Imgpojo>imgs=new ArrayList<>();
        //缓存存在
        if(isExists("img")){
            String string=getKey("img");
            try {
                imgs=JsonUtil.jsonToList(string,Imgpojo.class);
                System.out.println("zou redis");
                return imgs;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        imgs =  userMapper.getimgAll();
        System.out.println("zou mysql");
            try {
                setKey("img", JsonUtil.objectToJson(imgs));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        return imgs;
    }

    @Override
    public String setKey(String key, String value) {
        return credisCluster.set(key,value);
    }

    @Override
    public String getKey(String key) {
        return credisCluster.get(key);
    }
}
