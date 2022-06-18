<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/17
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情</title>
</head>
<body>

<h1>名片详情</h1>

<table>
    <tbody>
    <tr>
        <th>姓名</th>
        <td>${card.name}</td>
    </tr>
    <tr>
        <th>电话</th>
        <td>${card.telephone}</td>
    </tr>
    <tr>
        <th>邮箱</th>
        <td>${card.email}</td>
    </tr>
    <tr>
        <th>公司</th>
        <td>${card.company}</td>
    </tr>
    <tr>
        <th>职位</th>
        <td>${card.post}</td>
    </tr>
    <tr>
        <th>地址</th>
        <td>${card.address}</td>
    </tr>
    <tr>
        <th>照片</th>
        <td>${card.logoName}</td>
    </tr>
    </tbody>
</table>

</body>
</html>
