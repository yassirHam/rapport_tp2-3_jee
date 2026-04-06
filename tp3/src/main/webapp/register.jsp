<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <meta charset="UTF-8">
</head>
<body>
<h1>REGISTER</h1>
<form action="registerHandler" method="post">
    Login: <input type="text" name="login"><br>
    Password: <input type="password" name="password"><br>
    <button type="submit">Register</button>
</form>

<c:if test="${requestScope.error != null}">
    <p>${requestScope.error}</p>
</c:if>
<a href="login.jsp" class="btn btn-primary">Login</a>
</body>
</html>
