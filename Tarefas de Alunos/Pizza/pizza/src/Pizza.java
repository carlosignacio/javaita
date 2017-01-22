import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {

	private List<String> pizza;
	static Map<String, Integer> contabilizaIngrediente;

	public Pizza() {
		pizza = new ArrayList<String>();
		contabilizaIngrediente = new HashMap<String, Integer>();
	}

	public void adicionaIngrediente(String ingrediente) {
		pizza.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	public float getPreco() {
		int qtde = pizza.size();
		return (qtde > 5) ? 23 : (qtde > 2) ? 20 : (qtde > 0) ? 15 : 0;
	}

	private static void contabilizaIngrediente(String ingrediente) {
		if (contabilizaIngrediente.containsKey(ingrediente)) {
			contabilizaIngrediente.put(ingrediente, contabilizaIngrediente.get(ingrediente) + 1);
		} else {
			contabilizaIngrediente.put(ingrediente, 1);
		}
	}
}
