
import java.util.Map;
import java.util.HashMap;

public class Pizza {
	
	String ingrediente;
	int qtdIngrediente = 0;
	int preco;
	static int contaIngrediente = 0;
	
	Map<String, Integer> mapa = new HashMap<String,Integer>();
	
	
	public void adicionaIngrediente(String ingrediente){
		this.ingrediente = ingrediente;
		qtdIngrediente++;
		mapa.put(ingrediente,contabilizaIngrediente());
	}
	
	public int getPreco(){
		if(qtdIngrediente <= 2)
			return preco = 15; 
		
		else if(qtdIngrediente > 2 && qtdIngrediente <= 5)
			return preco = 20;
		
		else
			return preco = 23;	
	}
	
	 public static int contabilizaIngrediente(){
		 return ++contaIngrediente;
		
	 }
	 
	public void qtdeIngrediente(){
		System.out.println("Quantidade de "+ingrediente+" usado: "+mapa.get(ingrediente));
	}
}
