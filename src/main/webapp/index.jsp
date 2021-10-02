<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Welcome!" %>
</h1>
<br/>
<form action="/welcome" method="post">
    First name: <input type="text" name="fname"><br>
    Last name: <input type="text" name="lname"><br>
    <input type="submit" value="Login">
</form>

<a href="hello-servlet">Hello Servlet</a>
</body>
</html>