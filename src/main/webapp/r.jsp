<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2022/9/29
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>message</title>
</head>
<body>
<p>uid:${sessionScope.person.uid}</p>
<p>uname:${sessionScope.person.uname}</p>
<p>age:${sessionScope.person.age}</p>
<p>健康码:${sessionScope.person.jkm}</p>
<p>区号:${sessionScope.person.area_no}</p>
</body>
</html>
