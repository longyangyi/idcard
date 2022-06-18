<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/17
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加名片</title>
</head>
<body>

<h1>添加名片</h1>

<form action="/card/addcard" method="post">
    姓名: <input type="text" name="name"><br>
    电话: <input type="text" name="telephone"><br>
    邮箱: <input type="text" name="email"><br>
    公司: <input type="text" name="company"><br>
    职位: <input type="text" name="post"><br>
    地址: <input type="text" name="address"><br>
    照片: <input type="text" name="logoName"><br>
    <input type="submit" value="添加">
</form>
</body>
</html>
