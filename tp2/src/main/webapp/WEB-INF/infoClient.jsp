<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info client</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<%String success = (String) request.getAttribute("success");%>
<%@ page import="model.Client" %>
<%Client c = (Client) request.getAttribute("client");%>
<div class="alert alert-success text-center">
    <%= success %>
</div>
 <h1> Affichage de donnees des clients : </h1>
 <table class="table">
  <thead>
    <tr>
      <th scope="col">nom</th>	
      <th scope="col">prenom</th>	
      <th scope="col">telephone</th>
      <th scope="col">E-mail</th>
    </tr>
  </thead>
  <tbody>
   <tr>
    <td ><%=c.getNom()%></td>
    <td ><%=c.getPrenom()%></td>
    <td ><%=c.getTelephone()%></td>
    <td ><%=c.getEmail()%></td>
   </tr>
  </tbody>
 </table>
</body>
</html>