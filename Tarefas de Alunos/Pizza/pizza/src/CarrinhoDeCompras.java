import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	List<Pizza> pizzas;

	public CarrinhoDeCompras() {
		pizzas = new ArrayList<Pizza>();
	}

	public float getValorTotal() {
		float soma = 0;

		for (Pizza pizza : pizzas) {
			soma += pizza.getPreco();
		}

		return soma;
	}

	public void add(Pizza pizza) {
		if (pizza.getPreco() > 0) {
			pizzas.add(pizza);
		} else {
			System.err.println("A pizza não contém ingredientes");
		}
	}

}
