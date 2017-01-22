
public class Principal {

	public static void main(String[] args) {
		
		Pizza mussarela = new Pizza();
		mussarela.adicionaIngrediente("mussarela");
		
		Pizza queijos4 = new Pizza();
		queijos4.adicionaIngrediente("mussarela");
		queijos4.adicionaIngrediente("catupiry");
		queijos4.adicionaIngrediente("gorgonzola");
		queijos4.adicionaIngrediente("parmesao");
		
		Pizza portuga  = new Pizza();
		portuga.adicionaIngrediente("mussarela");
		portuga.adicionaIngrediente("azeitona");
		portuga.adicionaIngrediente("ovo");
		portuga.adicionaIngrediente("ervilha");
		portuga.adicionaIngrediente("presunto");
		
		CarrinhoDeCompras Pedido = new CarrinhoDeCompras();
		
		if ((Pedido.adicionaPizza(mussarela)) == false) {
		   System.out.println("Pizza não contém ingredientes, não pode ser adicionada!");
		}
	
		if ((Pedido.adicionaPizza(queijos4)) == false) {
			   System.out.println("Pizza não contém ingredientes, não pode ser adicionada!");
			}
		
		if ((Pedido.adicionaPizza(portuga)) == false) {
			   System.out.println("Pizza não contém ingredientes, não pode ser adicionada!");
			}
		
		
		System.out.println("Total da Compra = "+Pedido.totalCompra()+" reais ");
		
		System.out.println("Foram utilizados "+Pedido.ingredientesDaPizza.entrySet());
		
	}

}
