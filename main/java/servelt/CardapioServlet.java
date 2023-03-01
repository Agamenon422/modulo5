package servelt;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CardapioDAO;
import model.Pizza;

import java.io.IOException;
import java.util.List;

/*CRIANDO SERVELT PARA CARDÁPIO!
*
*Criaremos uma classe Java que irá representar o 'servlet' responsável pelo tratamento das requisições HTTP.
* Essa classe deve ser anotada com "@WebServlet" e definir as rotas (URIs) para as operações CRUD (create,
* read, update, delete).*/
@WebServlet(value = "/cardapio")
public class CardapioServlet extends HttpServlet {
    @Inject
    private CardapioDAO cardapioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pizza> pizza = cardapioDAO.getCardapio();
        request.setAttribute("cardapio", pizza);
        request.getRequestDispatcher("cardapio.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String ingredientes = request.getParameter("ingredientes");
        Double preco = Double.parseDouble(request.getParameter("preco"));

        //criando uma nova pizza;
        Pizza pizza = new Pizza(nome, ingredientes, preco, "");

        cardapioDAO.adicionarPizza(pizza);

        response.sendRedirect("cardapio");
    }

}
