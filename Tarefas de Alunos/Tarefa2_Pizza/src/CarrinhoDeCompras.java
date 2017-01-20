
public class CarrinhoDeCompras {
	
	int totalPizza, precoPizza, numeroPizza = 0;
	Pizza obj;
	
	/* Metodo que recebe o objeto Pizza, restringe a criacao de uma pizza sem ingredientes,
	 * e quantifica quantas pizzas foram criadas */
	public void compras(Pizza obj){
		this.obj = obj;		
		if(this.obj.qtdIngrediente==0){
			System.out.println("Operacao Proibida!! -- Pizza sem ingredientes");
		}else{
			numeroPizza++; // quantidade de pizzas criadas
			precoPizza = this.obj.getPreco();
			totalPizza = totalPizza + precoPizza;
			System.out.println("Preço pizza "+numeroPizza+" = "+precoPizza);
		}						
	}
	
	// Imprimi valor total da compra de todas as pizzas
	public void imprimiTotal(){
		System.out.println("--------------------------------------");
		System.out.println("Valor total das "+numeroPizza+" pizzas = R$ "+totalPizza+" reais");
		System.out.println("--------------------------------------");
		
	}
	
	// Imprimi o total de ingredientes utilizados em todas as pizzas
	public void imprimiTotalIngredientes(){
		System.out.println("\n**************************************");
		System.out.println("Total de ingredientes das pizzas");
		System.out.println("**************************************");
		obj.imprimiIngredientes();
		System.out.println("**************************************");
	}
}
