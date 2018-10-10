<%--
  Created by IntelliJ IDEA.
  User: Shinelon
  Date: 2018/10/9
  Time: 17:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addUser</title>
</head>
<body>
<form action="/user/signUp" method="get">
    <table align="center">
        <tr><td>name：</td><td><input type="text" name="name"/></td></tr>
        <tr><td>age：</td><td><input type="text" name="age"/></td></tr>
        <tr><td><input type="submit" value="注册"></td><td><input type="reset" value="取消"></td></tr>
    </table>
</form>
<center><a href="../index.jsp"><button>返回</button></a></center>
</body>
</html>
