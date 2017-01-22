import java.util.ArrayList;
import java.util.HashMap;

public class CarrinhoDeCompras {

	int totalPizzas = 0;
	int totalCarrinho = 0;
	HashMap<String, Integer> ingredientesDaPizza;
	ArrayList<String> totalIngredientes;
	
	public boolean adicionaPizza(Pizza p) {
		if (p.contaIngredientes != 0) {
		   calculaTotalIngredientes(p);
		   precoPizza(p);
		   totalPizzas++;
		   return true;
		} else {
			return false;
		}
	}
	
	public void precoPizza(Pizza pt) {
		totalCarrinho += pt.getPreco();
	}
	
	int totalCompra() {
		return totalCarrinho;
	}
	
	public void calculaTotalIngredientes(Pizza p) {
		ingredientesDaPizza = p.getTotalIngredientes(p);
	}
		
	
}
