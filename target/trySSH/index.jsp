<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<body>
<h2>Hello World!</h2>
<form action="hello.action">
    <input type="text" name="personBo.id">
    <input type="text" name="personBo.name">
    <input type="submit" value="提交请求">
</form>
这个人的id是
${requestScope.personBo.id}
这个人的名字是
${requestScope.personBo.name}
</body>
</html>
