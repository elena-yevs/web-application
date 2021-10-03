<%@ page import="com.nixsolutions.evsiukova.entity.User" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 02.10.2021
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<h1>Welcome, admin!</h1>
<%--<% ArrayList<User> userList = (ArrayList<User>)request.getAttribute("users"); %>--%>

<table border="1">
    <c:forEach items="${ requestScope.users}" var="user">
        <tr>
            <td><c:out value="${user.id }"/></td>
            <td><c:out value="${user.role_id }"/></td>
            <td><c:out value="${user.username }"/></td>
            <td><c:out value="${user.firstName }"/></td>
            <td><c:out value="${user.lastName }"/></td>
            <td><c:out value="${user.dateOfBirth }"/></td>
            <td><c:out value="${user.password }"/></td>
            <td><c:out value="${user.email }"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
