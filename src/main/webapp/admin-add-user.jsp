<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="com.nixsolutions.evsiukova.connection.ConnectionManager" %>

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

<%
    ConnectionManager connectionManager = new ConnectionManager();
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String firstname = request.getParameter("firstname");
    String lastname = request.getParameter("lastname");
    String email = request.getParameter("email");
    String dateOfBirth = request.getParameter("birthday");
    String role = request.getParameter("role");
    int roleInt = 2;
//    if (role.equals("Admin")) {
//        roleInt = 1;
//    } else if (role.equals("User")) {
//        roleInt = 2;
//    }
    try {
        Connection connection = connectionManager.openConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("INSERT INTO users(id, role_id, username, firstname, lastname, dob, password, " +
                "email)values('" + 6 + "', '" + roleInt + "', '" + username + "','" + firstname + "','" + lastname +
                "','" + dateOfBirth + "','" + email + "','" + password + "')");
    } catch (SQLException e) {
        e.printStackTrace();
    }

%>
</body>
</html>
