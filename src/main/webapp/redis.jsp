<%--
  Created by IntelliJ IDEA.
  User: smile丶
  Date: 2019/2/11
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:forEach items="${imgs}" var="imgpojo">
    <img src="${imgpojo.path}"><br/>
    </c:forEach>

</body>
</html>
