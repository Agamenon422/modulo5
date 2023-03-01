<%--
  Created by IntelliJ IDEA.
  User: agame
  Date: 28/02/2023
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <!--Biblioteca Bootstrap para estilo-->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  <meta charset="UTF-8">
  <title>Excluir Pizza</title>
</head>
<body>
<h1>Excluir Pizza</h1>
<p>Tem certeza que deseja excluir a pizza ${pizza.nome}?</p>
<form method="POST" action="excluir-pizza">
  <input type="hidden" name="nome" value="${pizza.nome}">
  <button class="btn btn-primary" type="submit">Sim</button>
  <a href="${request.contextPath}/cardapio">Não</a>
</form>
</body>
</html>
