import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

	private int preco = 0;
	private int contador = 0;

	//Arraylist e Hashmap de ingredientes.

	ArrayList<String> ingredientes = new ArrayList<String>();
	static Map<String, Integer> contabilizaIngrediente = new HashMap <String, Integer>();	

	public void adicionaIngrediente(String ingrediente) {

		ingredientes.add(ingrediente); 
		contabilizaIngrediente(ingrediente);

	}


	private static void contabilizaIngrediente(String ingrediente) {	
		if (contabilizaIngrediente.containsKey(ingrediente)) {
			int qtd = contabilizaIngrediente.get(ingrediente);
			contabilizaIngrediente.put(ingrediente, qtd + 1);
		} else {
			contabilizaIngrediente.put(ingrediente, 1);
		}

	}
	
	public static void inicializaIngredientes() {	
		contabilizaIngrediente.clear();
	}

	public int getPreco(){
		contador = ingredientes.size();

		if (contador == 0) {
			preco = 0;			}
		else if (contador <= 2 ){ 
			preco = 15; 
		} 
		else if (contador <= 5) {
			preco = 20;
		} else if (contador > 5){
			preco = 23;
		} else
			preco = 0;

		return preco;

	}


	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}


	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}


	public static Map<String, Integer> getContabilizaIngrediente() {
		return contabilizaIngrediente;
	}


	public static void setContabilizaIngrediente(Map<String, Integer> contabilizaIngrediente) {
		Pizza.contabilizaIngrediente = contabilizaIngrediente;
	}

}
