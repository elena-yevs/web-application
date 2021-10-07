<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 04.10.2021
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DeleteUser</title>
</head>
<body>
<h1>Delete!</h1>
<%
    String driver = "org.postgresql.Driver";
    String connectionUrl = "jdbc:postgresql://localhost:5432/admin-users";
    String login = "postgres";
    String password = "s8g52916sL";
    Connection connection = null;

    String id = request.getParameter("id");
    try {
        Class.forName(driver);
        connection = DriverManager.getConnection(connectionUrl, login, password);
        Statement st = connection.createStatement();
        st.executeUpdate("DELETE FROM users WHERE id=" + id);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


%>

</body>
</html>
