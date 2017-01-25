import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompra {

	@Test
	public void compraAvista() {
		Compra c = new Compra(500); //valor a vista
		//Método
		assertEquals(1, c.getNumeroParcelas());
		assertEquals(500, c.getValorTotal());
		assertEquals(500, c.getValorParcela());
		
	}
	
	@Test
	public void compraParcelada() {
		Compra c = new Compra(4,250); //quantidade de parcelas e valor da parcela
		//Método
		assertEquals(4, c.getNumeroParcelas());
		assertEquals(1000, c.getValorTotal());
		assertEquals(250, c.getValorParcela());
		
	}

}
