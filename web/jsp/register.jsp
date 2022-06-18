<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/17
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>

<h1>注册</h1>

<form action="/user/register" method="post">
    用户名: <input type="text" name="uname"></br>
    密码: <input type="password" name="upwd">
    <input type="submit" value="注册">
</form>
</body>
</html>
