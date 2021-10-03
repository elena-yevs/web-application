<%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 03.10.2021
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WelcomeUser</title>
</head>
<body>
<h2>Welcome <%= request.getAttribute("email") %> !</h2>

<p>Click <a href="logout.jsp">here</a> to log out</p>
</body>
</html>
