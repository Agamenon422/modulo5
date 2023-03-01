package servelt;

import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CardapioDAO;
import model.Pizza;

import java.io.IOException;

/*Aqui irá representar as operação de remoção, no GET será redirecionado para uma tela de
* confirmação, caso clique em SIM o método para remover é acionado no POST.*/
@WebServlet("/excluir-pizza")
public class ExcluirPizzaServlet {
    @Inject
    private CardapioDAO cardapioDAO;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        Pizza pizza = cardapioDAO.getPizza(nome);
        request.setAttribute("pizza", pizza);
        request.getRequestDispatcher("excluir-pizza.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        cardapioDAO.excluirPizza(nome);
        response.sendRedirect(request.getContextPath() + "/cardapio");
    }

}
