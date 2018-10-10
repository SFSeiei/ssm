<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2018/10/9
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>signIn</title>
</head>
<body>
<form action="/user/signIn" method="get">
    <table align="center">
        <tr><td>id:</td><td><input type="text" name="id"></td>
        <tr><td>age:</td><td><input type="text" name="age"></td>
        <tr><td><input type="submit" value="登陆"></td><td><input type="reset" value="取消"></td></tr>
    </table>
</form>
<center><a href="../index.jsp"><button>返回</button></a></center>
</body>
</html>
