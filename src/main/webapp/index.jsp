<%--
  Created by IntelliJ IDEA.
  User: smile丶
  Date: 2019/1/29
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/upload" enctype="multipart/form-data" method="post">
        姓名：<input type="text" name="name">
        文件：<input type="file" name="file">
        <input type="submit" value="提交">
    </form>

    <form action="/register" enctype="multipart/form-data" method="post">
        用户名：<input type="text" name="userName"><br>
        密码：<input type="password" name="passWord"> <br>
        头像：<input type="file" name="file"><br>
        <input type="submit" value="注册">
    </form>

    <h5>上传结果：</h5>
    <img alt="暂无图片" src="${fileUrl}" />
</body>
</html>
