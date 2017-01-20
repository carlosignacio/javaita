package tarefa2qualoprecodapizza;

import java.util.*;

import tarefa2qualoprecodapizza.Pizza;

class CarrinhoDeCompras 
{
	private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void adicionaPizza(Pizza pizza) {
            if (pizza.SemIngredientes() != true) {
                pizzas.add(pizza);
            }
    }

        // calcula o preco total das pizzas do carrinho atraves do array
    
    public Integer getTotalPreco() {
            Integer valorTotal = 0;
            for (Pizza item : pizzas) {
                valorTotal += item.getPreco();   
            }
            return valorTotal;
    }

        // contabiliza as quantidades de todos os ingredientes de todas as pizzas
    
    public HashMap<String, Integer> getIngredientes() {
    	
            HashMap<String, Integer> cesta = new HashMap<String, Integer>();
        
            for (Pizza item : pizzas) {            
            	HashMap<String, Integer> ingredientes = item.getIngredientes();
                for (String key : ingredientes.keySet()) {
                    Integer total = ingredientes.get(key);
                    if (cesta.containsKey(key)) {
                        total += cesta.get(key);
                    }
                    cesta.put(key, total);
                }
            }

            return cesta;
    }

}


