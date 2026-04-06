<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>acceuil</title>
</head>
<body>
<h1>BIENVENUE ${sessionScope.user.getLogin()}</h1><br>
<form action="logout" method="POST">
 <input type="submit" value="logout" class="btn btn-danger">
</form>
</body>
</html>	