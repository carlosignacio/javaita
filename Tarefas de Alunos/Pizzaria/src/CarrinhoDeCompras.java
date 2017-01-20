

public class CarrinhoDeCompras {
	
	int totalPreco;
	
	
	public static int adicionaPizza(Pizza pizza){
		if(pizza.qtdIngrediente == 0){
			System.out.println("Não é possível adicionar uma pizza sem ingrediente ao carrinho de compras!");
			return totalPreco += 0;
		}
		else 
			return totalPreco += pizza.getPreco();
	}
	public static void imprime(){
		System.out.println("O total do carrinho de compras é: "+totalPreco+"!");
	}
}
