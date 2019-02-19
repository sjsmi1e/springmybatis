<%--
  Created by IntelliJ IDEA.
  User: smile丶
  Date: 2019/2/2
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h5>上传结果：</h5>
用户名${user.userName}
头像：
<img src="${pathurl}" style="height: 100px;width: 100px"/>
<a href="/download?photo=${user.photo}">下载</a>
</body>
</html>
