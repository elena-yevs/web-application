<%@ page import="com.nixsolutions.evsiukova.entity.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %><%--
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

<sql:query var="users"   dataSource="${myDS}">

</sql:query>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of users</h2></caption>
        <tr>
            <td>id</td>
            <td>role_id</td>
            <td>username</td>
            <td>firstname</td>
            <td>lastname</td>
            <td>dateOfBirth</td>
            <td>password</td>
            <td>email</td>
        </tr>
        <c:forEach var="user" items="${users}">
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
</div>

</body>

<
</html>
