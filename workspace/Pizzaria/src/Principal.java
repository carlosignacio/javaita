
public class Principal {

	public static void main(String[] args) {
		
		Pizza peperone= new Pizza();
		Pizza portuguesa= new Pizza();
		Pizza calabreza= new Pizza();
		
		peperone.adicionaIngrediente("peperone");
		portuguesa.adicionaIngrediente("portuguesa");
		calabreza.adicionaIngrediente("calabreza");

		CarrinhoDeCompras.pedidoPizza(peperone);
		CarrinhoDeCompras.pedidoPizza(portuguesa);
		CarrinhoDeCompras.pedidoPizza(calabreza);
		
		CarrinhoDeCompras.imprime();
		peperone.qtdeIngrediente();
		portuguesa.qtdeIngrediente();
		calabreza.qtdeIngrediente();
	}

}
