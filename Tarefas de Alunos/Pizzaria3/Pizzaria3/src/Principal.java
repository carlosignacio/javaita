
public class Principal {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("molho");
		p1.adicionaIngrediente("carne");
		p1.adicionaIngrediente("carne");
		p1.adicionaIngrediente("carne");
		p1.adicionaIngrediente("carne");
		p1.adicionaIngrediente("carne");

		Pizza p2 = new Pizza();	

		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("queijo");
		p3.adicionaIngrediente("carne");
		p3.adicionaIngrediente("carne");
			
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaPizza(p1);
		c1.adicionaPizza(p2);
		c1.adicionaPizza(p3);
		c1.valorTotalTodasPizzasAdicionadas();
		c1.imprimeIngredientePorQuantidade();
	}
}
