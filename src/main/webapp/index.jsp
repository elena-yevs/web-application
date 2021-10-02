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
<form action="${pageContext.request.contextPath}/welcome" method="get">
    Email: <label>
    <input type="text" name="email">
</label><br>
    Password: <label>
    <input type="password" name="password">
</label><br>
    <input type="submit" value="Login">
</form>

</body>
</html>