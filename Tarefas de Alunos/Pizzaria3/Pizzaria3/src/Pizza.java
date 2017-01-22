import java.util.HashMap;

public class Pizza {

	int quantidadeIngredientes = 0;
	double valorPizzaPorIngredientes = 0;
	static int quantidadeIngredientesTodasPizzas = 0;
	 HashMap<String, Integer> listaIngredientes = new HashMap<String, Integer>();

	public void adicionaIngrediente(String ingrediente) {
		listaIngredientes.put(ingrediente, quantidadeIngredientes++);
		contabilizaIngrediente();		
	}

	public double getPreco() {
		if (quantidadeIngredientes <= 2) {
			valorPizzaPorIngredientes = 15;
		} else if (quantidadeIngredientes >= 3 && quantidadeIngredientes <= 5) {
			valorPizzaPorIngredientes = 20;
		} else if (quantidadeIngredientes > 5) {
			valorPizzaPorIngredientes = 23;
		}
		quantidadeIngredientes = 0;
		return valorPizzaPorIngredientes;
	}

	public static int contabilizaIngrediente() {
		return quantidadeIngredientesTodasPizzas++;
	}
}