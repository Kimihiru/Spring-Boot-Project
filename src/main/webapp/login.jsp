<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2022/9/29
  Time: 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆验证界面</title>
</head>
<body>
学生健康信息录入
<hr>

<form method="post" action="/aop/r">
    <p>用户编号:<input type="text" name="uid" id="uid"></p>
    <hr>
    姓名:<input type="text" name="uname">年龄:<input type="text" name="age">区域编号:<input type="text" name="area_no">
    <p><input type="submit" value="提交"></p>
</form>

</body>
</html>
