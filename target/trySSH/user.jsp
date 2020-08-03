<%--
  Created by IntelliJ IDEA.
  User: George
  Date: 2020/8/4
  Time: 1:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户相关页面</title>
</head>
<body>
<form action="login.action">
    账号:<input type="text" name="account">
    密码:<input type="text" name="password">
    <input type="submit" value="用户登录">
</form>
<form action="exit.action">
    账号:<input type="text" name="account">
    密码:<input type="text" name="password">
    <input type="submit" value="用户退出">
</form>

</body>
</html>
