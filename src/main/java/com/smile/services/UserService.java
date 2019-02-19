package com.smile.services;

import com.smile.mapper.User2Mapper;
import com.smile.mapper.UserMapper;
import com.smile.pojo.Userpojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-01-29 20:07
 **/
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private User2Mapper user2Mapper;

    public List<Userpojo> getAll(){
        return userMapper.getAll();
    }

    public Userpojo getById(){
        return  user2Mapper.getById();
    }

    public int register(Userpojo user){
        return userMapper.register(user);
    }
}
