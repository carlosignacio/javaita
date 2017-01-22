import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCarrinho {

	@Test
	public void testaSemIngrediente() {
		Pizza p1 = new Pizza();
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p1);
		
		// Verifica se o carrinho impede inclusão de pizza sem ingredientes
		assertEquals(0, c.pizza.size());
	}
	
	@Test
	public void testaAdicionaPizza() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Muçarela");
		p1.adicionaIngrediente("Bacon");
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaPizza(p1);
		
		// Verifica se pizza foi adicionada ao carrinho
		assertEquals(1, c.pizza.size());
	}
	
	@Test
	public void testaValorTotal() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Muçarela");
		p2.adicionaIngrediente("Bacon");
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Muçarela");
		p3.adicionaIngrediente("Calabresa");
		p3.adicionaIngrediente("Oregano");
		CarrinhoDeCompras c1 = new CarrinhoDeCompras();
		c1.adicionaPizza(p2);
		c1.adicionaPizza(p3);
		
		
		// pizza com 2 ingredientes valor = 15, 3 ingredientes = 20. Total deve ser igual a = 35
		assertEquals(35, c1.valorTotal());
	}

}
