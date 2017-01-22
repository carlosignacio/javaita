import java.util.Map.Entry;
import java.util.Set;

public class CarrinhoDeCompras {
	double valorTotalCarrinho;
	Set<Entry<String, Integer>> produto;

	public void adicionaPizza(Pizza p) {		
		if (p.listaIngredientes.size() == 0) {
			System.out.println("Existe uma Pizza sem ingrediente, contém "
					+ p.listaIngredientes.size() + " ingredientes");
		} else {
			valorTotalCarrinho += p.getPreco();
		}
		produto = p.listaIngredientes.entrySet();
	}

	public void valorTotalTodasPizzasAdicionadas() {
		System.out.println("Valor à pagar: " + valorTotalCarrinho);
	}

	public void imprimeIngredientePorQuantidade() {
		System.out.println("Produtos: " + produto);
	}
}
