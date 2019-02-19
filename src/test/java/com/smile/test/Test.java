package com.smile.test;

import com.smile.pojo.Userpojo;
import com.smile.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-01-29 20:52
 **/
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names=ac.getBeanDefinitionNames();
//        for(String s:names)
//            System.out.println(s);
        UserService userService=ac.getBean("userService",UserService.class);
        List<Userpojo> list=userService.getAll();
        System.out.println(list);
    }

}
