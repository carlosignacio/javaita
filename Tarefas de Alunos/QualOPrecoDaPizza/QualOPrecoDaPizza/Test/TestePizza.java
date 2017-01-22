import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestePizza {

	@Test
	public void testPreco2ingredientes() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("mussarela");
		assertEquals(15,p.getPreco());
	}
		
	@Test
	public void testPreco3ingredientes() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("azeitona");
		p2.adicionaIngrediente("presunto");
		p2.adicionaIngrediente("ovo");
		assertEquals(20,p2.getPreco());
	}

	@Test
	public void testPreco6ingredientes() {
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("azeitona");
		p3.adicionaIngrediente("presunto");
		p3.adicionaIngrediente("ovo");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("escarola");
		p3.adicionaIngrediente("milho");
		assertEquals(23,p3.getPreco());
	}

	@Test
	public void testVerificaingredientes() {
		Pizza p4 = new Pizza();

		p4.adicionaIngrediente("mussarela");
		p4.adicionaIngrediente("tomate");
		p4.adicionaIngrediente("manjericao");
		assertTrue(p4.listaIngredientes.containsKey("mussarela"));
		assertTrue(p4.listaIngredientes.containsKey("tomate"));
		assertTrue(p4.listaIngredientes.containsKey("manjericao"));
	}
	
	@Test
	public void testTotalPedido(){
		Pizza mussarela = new Pizza();
		mussarela.adicionaIngrediente("mussarela");
		
		Pizza portuguesa = new Pizza();
		portuguesa.adicionaIngrediente("mussarela");
		portuguesa.adicionaIngrediente("tomate");
		portuguesa.adicionaIngrediente("ovo");
		portuguesa.adicionaIngrediente("presunto");
		portuguesa.adicionaIngrediente("oregano");

		CarrinhoDeCompras NovoPedido = new CarrinhoDeCompras();
		
		NovoPedido.adicionaPizza(mussarela);
		NovoPedido.adicionaPizza(portuguesa);
		
		assertEquals(35,NovoPedido.totalCompra());
	}
	
	@Test
	public void testPizzaSemIngrediente(){
		
		Pizza PizzaSemNada  = new Pizza();
		CarrinhoDeCompras Pedido = new CarrinhoDeCompras();
		
		assertFalse(Pedido.adicionaPizza(PizzaSemNada));
	}
	
	@AfterClass
	public static void testFinalizacao(){
	
		Pizza.zeraIngredientes();
		System.out.println("Teste After Class!");
		
	}
}
