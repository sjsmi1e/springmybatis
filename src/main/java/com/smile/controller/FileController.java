package com.smile.controller;

import com.smile.pojo.Userpojo;
import com.smile.services.UserService;
import org.apache.catalina.User;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @program: springmybatis
 * @description: ${description}
 * @author: smile丶
 * @create: 2019-02-02 12:03
 **/
@Controller
public class FileController {
    @Autowired
    private UserService userService;
    @RequestMapping("/upload")
    public String uploadFile(MultipartFile file,String name,HttpServletRequest request) throws IOException {
        System.out.println(name);
        String originalFilename = file.getOriginalFilename();
        String suffix=originalFilename.substring(originalFilename.lastIndexOf("."));
        String fileName=UUID.randomUUID().toString()+suffix;
        String path=request.getServletContext().getRealPath("file")+"\\"+fileName;
        FileUtils.copyInputStreamToFile(file.getInputStream(),new File(path));
        return "/index.jsp";
    }
    @RequestMapping("/register")
    public String register(Userpojo userpojo, MultipartFile file, HttpServletRequest request){
        String fileName=UUID.randomUUID().toString()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String path=request.getServletContext().getRealPath("image")+"\\"+fileName;
        System.out.println(path);
        try {
            FileUtils.copyInputStreamToFile(file.getInputStream(),new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        userpojo.setPhoto(fileName);
        System.out.println(userpojo);
        int index=userService.register(userpojo);
        request.setAttribute("user",userpojo);
        request.setAttribute("pathurl","/image/"+userpojo.getPhoto());
        if(index>0)
            return "/main.jsp";
        else
            return "index.jsp";
    }

    @RequestMapping("/download")
    public void download(String photo,HttpServletResponse response,HttpServletRequest request) throws IOException {
        response.setHeader("Content-Disposition","attachment;filename="+photo);
        ServletOutputStream os=response.getOutputStream();
        File file = new File(request.getServletContext().getRealPath("image"),photo);
        os.write(FileUtils.readFileToByteArray(file));
        os.flush();
        os.close();
    }

}
