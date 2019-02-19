package com.smile.test;

import com.smile.pojo.Userpojo;
import com.smile.services.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-01-31 10:35
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserTest {

    @Resource
    private UserService userService;

    @Test
    public void main() {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        String[] names=ac.getBeanDefinitionNames();
//        for(String s:names)
////            System.out.println(s);
//        UserService userService=ac.getBean("userService",UserService.class);
        List<Userpojo> list=userService.getAll();
        System.out.println(list);
        System.out.println(userService.getById());
    }
}
