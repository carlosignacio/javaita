import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePizza {

	@Before
	public void testInicializa(){
		// Método invocado para inicializar o registro de ingredientes
		Pizza.inicializaIngredientes();

	}

	@Test
	public void testaPreco() {
		Pizza p = new Pizza();
		p.adicionaIngrediente("Muçarela");
		p.adicionaIngrediente("Bacon");

		// verifica se o valor da pizza está correto, de acordo com a quantidade de ingredientes
		assertEquals(15, p.getPreco());
	}

	@Test
	public void testaIngredientes() {
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Muçarela");
		p2.adicionaIngrediente("Bacon");
		p2.adicionaIngrediente("Calabresa");
		p2.adicionaIngrediente("Oregano");

		// Verifica os ingredientes utilizados, desconsiderando a quantidade de cada um
		assertEquals(4, Pizza.contabilizaIngrediente.size());

	}

	@Test
	public void testaInclusaoIngrediente() {
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Muçarela");

		// Verifica se o registro de ingredientes funcionou corretamente
		assertEquals(1, p1.getIngredientes().size());

	}
}
