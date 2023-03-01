package model;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

/*CRIANDO BANCO DE MEMÓRIA!
*
* Neste passo, será criado a classe que irá representar as funcionalidades básicas
* de um banco de dados, como, criar, atualizar, remover e ler nosso cardápio.

*Nesta classe foi adicionado a anotação @ApplicationScoped para definir apenas 1 instância
* dessa classe por todo o ciclo de vida da aplicação, ou seja, ele é criado apenas 1x enquanto
* o projeto está em execução.*/
@ApplicationScoped
public class CardapioDAO {
    private List<Pizza> pizzas = new ArrayList<>();

    public List<Pizza> getCardapio() {
        return pizzas;
    }

    public Pizza getPizza(String nome) {
        for (Pizza pizza : pizzas) {
            if (pizza.getNome().equals(nome)) {
                return pizza;
            }
        }
        return null;
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void atualizarPizza(String nomeAntigo, Pizza pizzaAtualizada) {
        for (Pizza pizza : pizzas) {
            if (pizza.getNome().equals(nomeAntigo)) {
                pizza.setNome(pizzaAtualizada.getNome());
                pizza.setIngredientes(pizzaAtualizada.getIngredientes());
                pizza.setPreco(pizzaAtualizada.getPreco());
                pizza.getImagem(pizzaAtualizada.getImagem());
            }
        }
    }

    public void excluirPizza(String nome) {
        pizzas.removeIf(pizza -> pizza.getNome().equals(nome));
    }
}
