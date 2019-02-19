package com.smile.mapper;

import com.smile.pojo.Imgpojo;
import com.smile.pojo.Userpojo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-01-29 19:30
 **/
public interface UserMapper {
    //查询所有
    @Select("select * from userinfo")
    @Results({
            @Result(id = true ,column = "id",property = "id"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "password",property = "passWord"),
            @Result(column = "photo",property = "photo")
    })
    public List<Userpojo> getAll();

    //新增
    @Insert("insert into userinfo values(default,#{user.userName},#{user.passWord},#{user.photo})")
    public int register(@Param("user") Userpojo user);

    //查询所有相片
    @Select("select * from img")
    @Results({
            @Result(id = true ,column = "id",property = "id"),
            @Result(column = "path",property = "path"),
    })
    public List<Imgpojo> getimgAll();
}
