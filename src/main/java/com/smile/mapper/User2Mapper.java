package com.smile.mapper;

import com.smile.pojo.Userpojo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-01-31 13:00
 **/
public interface User2Mapper {
    //查询id
    @Select("select * from userinfo where id=1")
    @Results({
            @Result(id = true ,column = "id",property = "id"),
            @Result(column = "user_name",property = "userName"),
            @Result(column = "password",property = "passWord")
    })
    public Userpojo getById();
}
