package tarefa2qualoprecodapizza;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		
		//criando as pizzas e adicionando os ingredientes e quantidades a cada pizza
		
		Pizza baiana = new Pizza();
        baiana.adicionarIngrediente("Pimenta", 1);
        baiana.adicionarIngrediente("Ovo", 3);
        baiana.adicionarIngrediente("Calabresa", 5);

        Pizza vegana = new Pizza();
        vegana.adicionarIngrediente("Massa Vegana", 1);
        vegana.adicionarIngrediente("Mandiokeijo", 3);
        vegana.adicionarIngrediente("Rúcula", 2);
        vegana.adicionarIngrediente("Orégano", 2);

        Pizza sensacao = new Pizza();
        sensacao.adicionarIngrediente("Chocolate", 4);
        sensacao.adicionarIngrediente("Morango", 2);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(baiana);
        carrinho.adicionaPizza(vegana);
        carrinho.adicionaPizza(sensacao);
        
        // imprimindo valor total do carrinho

        System.out.println("Valor Total do Carrinho: " + carrinho.getTotalPreco() + " \n");
        
        //listando os ingredientes e quantidades
        
        System.out.println("Quantidade de cada ingrediente utilizado");
        for(Map.Entry<String, Integer> entry : carrinho.getIngredientes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

}