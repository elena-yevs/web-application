<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1><%= "Welcome!" %>
</h1>
<br/>
<form action="${pageContext.request.contextPath}/welcome" method="post">
    First name: <label>
    <input type="text" name="fname">
</label><br>
    Last name: <label>
    <input type="text" name="lname">
</label><br>
    <input type="submit" value="Login">
</form>

<a href="welcome">Login</a>
</body>
</html>