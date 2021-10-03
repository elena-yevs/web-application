<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 03.10.2021
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddUser</title>
</head>
<body>
<h1>Add new user</h1>
<br/>
<form action="${pageContext.request.contextPath}/welcome" method="post">
   Username: <label>
    <input type="text" name="username">
</label><br>
    Password: <label>
    <input type="password" name="password">
</label><br>
    Password again: <label>
    <input type="password" name="password">
</label><br>
    Firstname: <label>
    <input type="text" name="firstname">
</label><br>
    Lastname: <label>
    <input type="text" name="lastname">
</label><br>
    Email: <label>
    <input type="text" name="email">
</label><br>
    Date of birth: <label>
    <input type="text" name="birthday">
</label><br>
    Role: <label>
    <select>
        <option value="user">User</option>
        <option value="admin">Admin</option>
    </select>
</label><br>
    <input type="submit" value="Ok">
    <p><a href="admin-table.jsp">Cancel</a></p>
</form>
</body>
</html>
