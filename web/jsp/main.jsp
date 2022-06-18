<%--
  Created by IntelliJ IDEA.
  User: louis
  Date: 2022/6/17
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页</title>
</head>
<body>

<h1>主页</h1>

<table>
    <tbody>
    <tr>
        <th>姓名</th>
        <th>公司</th>
        <th>职位</th>
        <th>操作</th>
    </tr>
    <C:forEach items="${allCards}" var="card">
        <tr>
            <td>${card.name}</td>
            <td>${card.company}</td>
            <td>${card.post}</td>
            <td>
                <a href="/card/detail?id=${card.id}">详情</a>
                <a href="/card/toupdate?id=${card.id}">修改</a>
                <a href="/card/delete?id=${card.id}">删除</a>
            </td>
        </tr>
    </C:forEach>
    </tbody>
</table>


<a href="/card/toaddcard">添加名片</a>
<a href="/user/topassword">修改密码</a>

</body>
</html>
