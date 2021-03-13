<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ZWJ
  Date: 2021/3/12
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
</head>
<body>
商品列表。。。。
<hr>
<c:forEach items="${list}" var="student">
    <p>${student.sno}--${student.sname}--${student.ssex}--${student.sbirthday}--${student.sclass}</p>
</c:forEach>
</body>
</html>
