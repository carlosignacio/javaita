import java.util.HashMap;
import java.util.Map;


public class Pizza {
	
	int preco, qtdIngrediente, aux = 0;
	private static String ingrediente;
	
	// HashMap para guardar os ingredientes utilizados por todas as pizzas
	static Map<String, Integer> registro = new HashMap<String, Integer>();
	
	/* Metodo que adiciona os ingredientes */
	public void adicionaIngrediente(String ingrediente){		
		qtdIngrediente++;
		setIngrediente(ingrediente);
		contabilizaIngrediente();
	}
	
	/* Metodo que registra a quantidade de ingredientes utilizados 
	 * em todas as pizzas */
	static void contabilizaIngrediente(){
		if(registro.containsKey(getIngrediente())){
			registro.put(getIngrediente(), registro.get(getIngrediente())+1);			
		} else{
			registro.put(getIngrediente(), 1);
		}
		
	}
	
	// Metodo que imprimi o HashMap com a quantidade de cada ingrediente
	public void imprimiIngredientes(){
		for (String ingrediente : registro.keySet()) {            
            //Captura-se o valor a partir da chave
            Integer value = registro.get(ingrediente);
            System.out.println(ingrediente + " = " + value);
     }
	}
	
	// Metodo que calcula o preco da pizza
	public int getPreco() {
		if(qtdIngrediente<=2){
			preco = 15;
			return preco;
		} else if(qtdIngrediente>=3 && qtdIngrediente<=5){
			preco = 20;
			return preco;
		} else {
			preco = 23;
			return preco;
		}
	}

	public static String getIngrediente() {
		return ingrediente;
	}

	public static void setIngrediente(String ingrediente) {
		Pizza.ingrediente = ingrediente;
	}	

}
