<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Login</title>
</head>
<body>
<% String error = (String) request.getAttribute("error");
if(error != null){%>
<div class="alert alert-danger text-center">
        <%= error %>
    </div>
<%
}
%>
<% String success = (String) request.getAttribute("success");
if(success != null){%>
<div>
       <%= error %>
  </div>
<%
}
%>
<form action="loginHandler" method="POST" >
 login:<input type="text" name="login"><br>
 mot de passe:<input type="password" name="mdp"><br>
 <input type="submit" value="login" class="btn btn-success">
</form>
</body>
</html>