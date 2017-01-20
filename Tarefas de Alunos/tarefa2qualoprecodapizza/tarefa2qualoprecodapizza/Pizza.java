package tarefa2qualoprecodapizza;

import java.util.*;

class Pizza
{
	private HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();

	public void adicionarIngrediente(String ingrediente, Integer qtde)
	{
		// recebe o ingrediente e a quantidade para inserir no HashMap
		ingredientes.put(ingrediente, qtde);
	}

	// verificando se a pizza nao tem ingredientes
	public boolean SemIngredientes() {
		boolean SemIngredientes;
		if (ingredientes.size() !=0)
			SemIngredientes = false; 
		else 
			SemIngredientes = true;            	
		return SemIngredientes;
	}

	// calcula o preco da pizza conforme a regra de qtde de ingredientes
	public int getPreco()
	{
		int totalPizza = 0;

		for (int quantidadeIngrediente : ingredientes.values()) {

			int preco = 0;

			if (quantidadeIngrediente <= 2) {
				preco = 15;
			} else if (quantidadeIngrediente >=3 & quantidadeIngrediente <= 5) {
				preco = 20;
			} else {
				preco = 23;
			}
			totalPizza += preco;
		}

		return totalPizza;

	}

	// retorna os ingredientes para o CarrinhoDeCompras
	public HashMap<String, Integer> getIngredientes()
	{
		return ingredientes;
	}
}