<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/18
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
</head>
<body>

<h1>修改密码</h1>

<form action="/user/password" method="post">
    新密码：<input type="password" name="upwd"><br>
    <input type="submit" value="修改">
</form>


</body>
</html>
