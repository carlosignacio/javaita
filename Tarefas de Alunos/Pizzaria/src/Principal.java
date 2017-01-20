
public class Principal {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();
		
		
		
		pizza1.adicionaIngrediente("calabresa");
		pizza2.adicionaIngrediente("mussarela");
		pizza3.adicionaIngrediente("peito de frango");
		
		CarrinhoDeCompras.adicionaPizza(pizza1);
		CarrinhoDeCompras.adicionaPizza(pizza2);
		CarrinhoDeCompras.adicionaPizza(pizza3);
		
		
		CarrinhoDeCompras.imprime();
		pizza1.qtdeIngrediente();
		pizza2.qtdeIngrediente();
		pizza3.qtdeIngrediente();
	}

}
