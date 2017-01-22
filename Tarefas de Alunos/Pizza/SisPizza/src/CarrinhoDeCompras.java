import java.util.ArrayList;

public class CarrinhoDeCompras {
	int total = 0;

	ArrayList<Pizza> pizza = new ArrayList<Pizza>();

	public void adicionaPizza(Pizza p) {
		if (p.getPreco() > 0)
			pizza.add(p); 
		else
			System.out.println("Pizza não possui ingredientes");
	}

	public int valorTotal (){

		for (Pizza p: pizza){

			if (p.getPreco() > 0)
				total += p.getPreco();
			else
				total = 0;

		}

		return total;
	}

}
