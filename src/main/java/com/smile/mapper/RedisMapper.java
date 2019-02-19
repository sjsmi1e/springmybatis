package com.smile.mapper;

import com.smile.pojo.Imgpojo;

import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-02-11 15:02
 **/

public interface RedisMapper {
    boolean isExists(String key);
    List<Imgpojo> getAll();
    String setKey(String key,String value);
    String getKey(String key);
}
