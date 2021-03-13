<%--
  Created by IntelliJ IDEA.
  User: ZWJ
  Date: 2021/3/13
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生页面</title>
</head>
<body>
<form action="save.do" method="post">
    <p>sno<input name="sno"></p>
    <p>sname<input name="sname"></p>
    <p>ssex<input name="ssex"></p>
    <p>sbirthday<input type="datetime-local" name="sbirthday"></p>
    <p>sclass<input name="sclass"></p>
    <input type="submit" value="提交">
</form>
</body>
</html>
