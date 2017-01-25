import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testePizzaria {

	@Before
	public void before(){
		Pizza.somaIngredientes = 0;
	}
	
	
	@Test
	public void testAdiciona1Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		assertEquals(1,p.qtdIngrediente);
	}
	
	@Test
	public void testAdiciona2Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		assertEquals(2,p.qtdIngrediente);
	}
	
	@Test
	public void testAdiciona3Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		p.adicionaIngrediente("Calabreza");
		assertEquals(3,p.qtdIngrediente);
	}

	@Test
	public void testPreco1Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		assertEquals(15,p.getPreco());
	}
	
	@Test
	public void testPreco2Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		assertEquals(15,p.getPreco());
	}
	
	@Test
	public void testPreco3Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		p.adicionaIngrediente("Calabreza");
		assertEquals(20,p.getPreco());
	}
	
	@Test
	public void testPreco4Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		p.adicionaIngrediente("Calabreza");
		p.adicionaIngrediente("4 Queijos");
		assertEquals(20,p.getPreco());
	}
	
	@Test
	public void testPreco5Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		p.adicionaIngrediente("Calabreza");
		p.adicionaIngrediente("4 Queijos");
		p.adicionaIngrediente("Peperone");
		assertEquals(20,p.getPreco());
	}
	
	@Test
	public void testPreco6Pizza() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Marguerita");
		p.adicionaIngrediente("Portuguesa");
		p.adicionaIngrediente("Calabreza");
		p.adicionaIngrediente("4 Queijos");
		p.adicionaIngrediente("Peperone");
		p.adicionaIngrediente("Lombo");
		assertEquals(23,p.getPreco());
	}
	
}


