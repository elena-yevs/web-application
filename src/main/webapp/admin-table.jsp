<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="com.nixsolutions.evsiukova.connection.ConnectionManager" %><%--
  Created by IntelliJ IDEA.
  User: elena
  Date: 03.10.2021
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%
    String driver = "org.postgresql.Driver";
    String connectionUrl = "jdbc:postgresql://localhost:5432/admin-users";
    String login = "postgres";
    String password = "s8g52916sL";
    try {
        Class.forName(driver);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WelcomeAdmin</title>
</head>
<body>
<h2>Welcome, admin!</h2>
<div align="center">
    <table border="1" cellpadding="5">
    <tr bgcolor="#B0C4DE">
        <td>id</td>
        <td>role_id</td>
        <td>username</td>
        <td>firstname</td>
        <td>lastname</td>
        <td>email</td>
        <td>dateOfBirth</td>
        <td>password</td>


    </tr>
    <%
        try{
            connection = DriverManager.getConnection(connectionUrl, login, password);
            statement=connection.createStatement();
            String sql ="SELECT * FROM users";
            resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
    %>
    <tr bgcolor="#E0FFFF">
        <td><%=resultSet.getInt(1) %></td>
        <td><%=resultSet.getInt(2) %></td>
        <td><%=resultSet.getString(3) %></td>
        <td><%=resultSet.getString(4) %></td>
        <td><%=resultSet.getString(5) %></td>
        <td><%=resultSet.getString(6) %></td>
        <td><%=resultSet.getString(7) %></td>
        <td><%=resultSet.getString(8) %></td>
    </tr>
    <%
            }
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    %>
</table>
</div>
<p>Click <a href="logout.jsp">here</a> to log out</p>
<p>Click <a href="admin-add-user.jsp">here</a> to add new user</p>
</body>
</html>
