import java.util.HashMap;

public class Pizza {
	
	int contaIngredientes = 0;
	static int qtdeIngredientes = 0;
	static HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
	HashMap<String, Integer> listaIngredientes;
	
	public static void zeraIngredientes() {
		if (ingredientes.size() != 0) {
		   ingredientes.clear();
		}
	}
	
	public Pizza () {
		listaIngredientes = new HashMap<String, Integer>();
	}
	
	public void contabilizaIngredientes() {
		qtdeIngredientes++;
		contaIngredientes++;
	}
	
	HashMap<String, Integer> getTotalIngredientes(Pizza p) {
		return ingredientes;
	}
	
		
	void adicionaIngrediente(String ingrediente) {
		contabilizaIngredientes();
		listaIngredientes.put(ingrediente, qtdeIngredientes);
		
		contaIngrediente(ingrediente);
	}
	
	public void contaIngrediente(String ingrediente) {
		if (ingredientes.containsKey(ingrediente) == false) {
			ingredientes.put(ingrediente, 1);
		} else {
			int valor = ingredientes.get(ingrediente);
			valor++;
			ingredientes.replace(ingrediente, valor);
		}
	}
	
	int getPreco() {
		if (listaIngredientes.size() < 3) {
			return 15;
		} else {
			if (listaIngredientes.size() < 6) {
				return 20;
			} else {
				return 23;
			}
		}
	}
}
