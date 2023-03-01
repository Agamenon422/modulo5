<%--
  Created by IntelliJ IDEA.
  User: agame
  Date: 27/02/2023
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<!--Criar um arquivo do formato jsp com o nome nova-pizza.jsp no
pacote src/main/webapp que irá representar o cadastro da pizza.-->

<head>
    <!--Biblioteca Bootstrap para estilo-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Criar Pizza</title>
</head>
<body>
<h1>Criar Pizza</h1>
<form>
    <label for="nome">Nome: </label>
    <input id="nome" type="text" name="nome" required>
    <br>
    <label for="ingredientes">Ingredientes: </label>
    <input id="ingredientes" type="text" name="ingredientes" required>
    <br>
    <label for="preco">Preço: </label>
    <input id="preco" type="text" name="preco" required>
    <br>
    <button class="btn btn-primary" type="submit">Salvar</button>
</form>
</body>
</html>
