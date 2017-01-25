import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteContaEspecial extends TesteContaCorrente {

	@Before
	public void inicializaConta(){
		cc = new ContaEspecial(100);
		cc.depositar(200);
	}
	
	@Test
	public void saqueMaiorQueSaldo() {
		int valorSacado = cc.sacar(350);
		assertEquals(200,cc.saldo);
		assertEquals(valorSacado, 0);
	}
	
	@Test
	public void saqueMaiorQueSaldoDentroDoLimite() {
		int valorSacado = cc.sacar(250);
		assertEquals(-50,cc.saldo);
		assertEquals(valorSacado, 250);
	}
}

