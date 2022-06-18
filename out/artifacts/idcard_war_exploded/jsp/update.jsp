<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/18
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改名片</title>
</head>
<body>

<h1>修改名片</h1>

<form action="/card/update" method="post">
    <input type="text" name="id" value="${card.id}" style="display: none"><br>
    名称: <input type="text" name="name" value="${card.name}"><br>
    电话: <input type="text" name="telephone" value="${card.telephone}"><br>
    邮箱: <input type="text" name="email" value="${card.email}"><br>
    公司: <input type="text" name="company" value="${card.company}"><br>
    职位: <input type="text" name="post" value="${card.post}"><br>
    地址: <input type="text" name="address" value="${card.address}"><br>
    照片: <input type="text" name="logoName" value="${card.logoName}"><br>
    <input type="submit" value="修改">
</form>

</body>
</html>
