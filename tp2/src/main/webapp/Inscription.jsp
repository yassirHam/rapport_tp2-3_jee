<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Inscription</title>
</head>
<body>
<%
String error = (String) request.getAttribute("error");
if(error != null){
%>
    <div class="alert alert-danger text-center">
        <%= error %>
    </div>
<%
}
%>
<h1>Ajouter un client :</h1>
<form action="creeClient" method="POST">
 Nom:<input type="text" name="nom" required><br>
 Prenom:<input type="text" name="prenom" required><br>
 telephone:<input type="text" name="telephone" required><br>
 email:<input type="email" name="email" required><br>
 <input type="submit" value="Ajouter Client" class="btn btn-success" required>
</form>
</body>
</html>