package servelt;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CardapioDAO;
import model.Pizza;

import java.io.IOException;

/*Essa classe irá representar as operações da edição de uma pizza, nesta classe foi necessário
* o apontamento do endereço para o arquivo JSP porque a aplicação deve passar informações que
* estão na classe para a tela.*/
@WebServlet("/editar-pizza")
public class EditarPizzaServlet extends HttpServlet {
    @Inject
    private CardapioDAO cardapioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Pizza pizza = cardapioDAO.getPizza(nome);
        request.setAttribute("pizza", pizza);
        request.getRequestDispatcher("editar-pizza.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeAntigo = request.getParameter("nomeAntigo");
        String nomeNovo = request.getParameter("nome");
        String ingredientes = request.getParameter("ingredientes");
        Double preco = Double.parseDouble(request.getParameter("preco"));

        Pizza pizza = new Pizza(nomeNovo, ingredientes, preco, "");
        cardapioDAO.atualizarPizza(nomeAntigo, pizza);

        response.sendRedirect(request.getContextPath() + "/cardapio");
    }

}
