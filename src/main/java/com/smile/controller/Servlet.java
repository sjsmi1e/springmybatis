package com.smile.controller;

import com.smile.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: springmybatis
 * @description: spring无法管理控制层，不能使用注解
 * @author: smile丶
 * @create: 2019-01-29 20:23
 **/
@WebServlet(urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
//    @Autowired
//    @Qualifier("userService")
    private UserService userService;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WebApplicationContext requiredWebApplicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        userService=requiredWebApplicationContext.getBean("userService",UserService.class);
        //JSONArray listArray=JSONArray.fromObject(userService.getAll());
        response.getWriter().print(userService.getAll());

    }
}
