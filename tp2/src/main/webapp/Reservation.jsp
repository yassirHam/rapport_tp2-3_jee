<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Reservation</title>
</head>
<body>
<%String error = (String) request.getAttribute("errorrr");if(error != null){%>
    <div class="alert alert-danger text-center">
        <%= error %>
    </div>
<%
}
%>
<h1>Ajouter une reservation :</h1>
<form action="creeReservation" method="POST">
 Nom:<input type="text" name="nom" required><br>
 Prenom:<input type="text" name="prenom" required><br>
 telephone:<input type="text" name="telephone" required><br>
 email:<input type="email" name="email" required><br>
 Type:<select id="type" name="type" required>
        <option value="Chambre Single" selected>Chambre Single</option>
        <option value="Chambre Double">Chambre Double</option>
        <option value="suite">Suite</option>
    </select>
    <br><br>
 prix:<input type="number" name="prix" required><br>
 vue:<select name="vue" required>
        <option value="piscine">piscine</option>
        <option value="nature">nature</option>
        <option value="standard" selected>standard</option>
    </select>
    <br>
 <input type="submit" value="Ajouter Reservation" class="btn btn-success" required>
</form>
</body>
</html>