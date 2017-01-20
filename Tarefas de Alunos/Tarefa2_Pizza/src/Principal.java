
public class Principal {

	public static void main(String[] args) {
		// Criacao das 3 pizzas
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();		
		
		// Ingredientes das pizzas
		p1.adicionaIngrediente("tomate");	p1.adicionaIngrediente("margherita");
		p1.adicionaIngrediente("presunto");	p1.adicionaIngrediente("peperoni");
		p1.adicionaIngrediente("calabresa"); p1.adicionaIngrediente("catupiri");
						
		p2.adicionaIngrediente("mussarela"); p2.adicionaIngrediente("presunto");
		
		p3.adicionaIngrediente("tomate");	p3.adicionaIngrediente("azeitona");
		p3.adicionaIngrediente("mussarela"); p3.adicionaIngrediente("bacon");
		
		// Criacao do carrinho
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// Adiciona as Pizzas no CarrinhoDeCompra
		carrinho.compras(p1);
		carrinho.compras(p2);
		carrinho.compras(p3);
		
		carrinho.imprimiTotal(); // Imprime o total do CarrinhoDeCompra
		carrinho.imprimiTotalIngredientes(); // Imprime a quantidade utilizada de cada ingrediente

	}

}
