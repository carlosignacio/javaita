import java.util.Map;
import java.util.HashMap;

public class Pizza {
	
	static int somaIngredientes = 0; 
	int total;
	String ingrediente; 
	int qtdIngrediente = 0;
	
	Map<String, Integer> mapa = new HashMap<String,Integer>();
		
	public void adicionaIngrediente(String ingrediente){
		this.ingrediente = ingrediente;
		qtdIngrediente++;
		mapa.put(ingrediente,contabilizaIngrediente());
	}
		
	public int getPreco(){
		int total = 0;
		if (somaIngredientes <= 2){
			total = 15;
			return total;
		} else if (somaIngredientes >= 3 && somaIngredientes <=5 ){
			total = 20;
			return total;
		} else {
			total = 23;
			return total;
		}
			 
	}
	
	public static int contabilizaIngrediente () {
		return ++somaIngredientes; 
		}
	
	public void qtdeIngrediente(){
		System.out.println("Foram usados "+ingrediente+" ingredientes: "+mapa.get(ingrediente));
	}
}

	

