
public class CarrinhoDeCompras {
	
	static int compras; 
	
	public static int pedidoPizza (Pizza p){
		if(p.qtdIngrediente == 0){
			System.out.println("Favor escolher os ingredientes para finalizar o pedido!");
			return compras += 0;
		}else
			return compras += p.getPreco();
		}
	
		public static void imprime(){
			System.out.println("O Valor do Pedido �: "+compras+"" );
			
	}			

}
