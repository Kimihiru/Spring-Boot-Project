<%--
  Created by IntelliJ IDEA.
  User: Sakura
  Date: 2022/9/29
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>核酸检测</title>
</head>
<body>
<div id="d2">
    <form>
        <table>
            <tr>
                <th>uid</th>
                <th>uname</th>
                <th>age</th>
                <th>健康码</th>
                <th>区号</th>
            </tr>
            <c:forEach items="${sessionScope.list}" var="person">
                <tr>
                    <td>${person.uid}</td>
                    <td>${person.uname}</td>
                    <td>${person.age}</td>
                    <td>${person.jkm}</td>
                    <td>${person.area_no}</td>
                </tr>
            </c:forEach>
        </table>
    </form>
</div>
<form method="post" action="/aop/redis">
    <p><input type="submit" value="核酸检测"/></p>
</form>
</body>
</html>
