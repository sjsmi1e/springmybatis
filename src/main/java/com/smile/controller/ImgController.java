package com.smile.controller;

import com.smile.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-02-11 15:40
 **/
@Controller
public class ImgController {
    @Autowired
    RedisService redisService;
    @RequestMapping("/show")
    public String show(HttpServletRequest request){
        request.setAttribute("imgs",redisService.getAll());
        System.out.println(redisService.getAll());
        return "/redis.jsp";
    }
}
