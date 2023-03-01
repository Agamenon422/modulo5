<%--
  Created by IntelliJ IDEA.
  User: agame
  Date: 28/02/2023
  Time: 20:22
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html>

<!--Criando um arquivo do formato jsp com o nome editar-pizza.jsp no
pacote src/main/webapp que irá representar a edição da pizza
escolhida na tela de listagem.-->

<head>

    <!--Biblioteca Bootstrap para estilo-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Editar Pizza</title>
</head>
<body>
<h1 style="background: cornflowerblue">Editar Pizza</h1>
<form method="POST" action="editar-pizza">
            <!--o que é o hidden-->
    <input type="hidden" name="nomeAntigo" value="${pizza.nome}">
    <label for="nome">Nome:</label>
    <input id="nome" type="text" name="nome" value="${pizza.nome}" required><!--O que é o required?-->
    <br>

    <label for="ingredientes">Ingredientes:</label>
    <input id="ingredientes" type="text" name="nome" value="${pizza.ingredientes}"required>
    <br>

    <label for="preco">Preco:</label>
    <input id="preco" type="number" name="preco" step="0.01" min="0" value="${pizza.preco}"required>
    <br>                                     <!-- Explicar novamente o 'step' e o 'min'-->
    <button class="btn btn-primary" type="submit">Salvar</button>
</form>

</body>
</html>
