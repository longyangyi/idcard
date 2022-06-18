<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/12
  Time: 23:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>

<h1>登录</h1>

<form action="/user/login" method="post">
    用户名: <input type="text" name="uname"></br>
    密码: <input type="password" name="upwd"></br>
    <input type="submit" value="登录">
</form>
</body>
</html>
