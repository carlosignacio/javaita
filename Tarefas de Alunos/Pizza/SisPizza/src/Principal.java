public class Principal {

	public static void main(String[] args) {


		// Instanciando a primeira pizza
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("Muçarela");
		p1.adicionaIngrediente("Calabresa");
		p1.adicionaIngrediente("Oregano");		

		// Instanciando a segunda pizza
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("Muçarela");
		p2.adicionaIngrediente("Catupiry");
		

		// Instanciando a terceira pizza
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("Alho");
		p3.adicionaIngrediente("Pimentao");
		p3.adicionaIngrediente("Frango");
		p3.adicionaIngrediente("Oregano");
		p3.adicionaIngrediente("Milho");
		p3.adicionaIngrediente("Muçarela");
        
		// Instanciando o carrinho de compras e adicionando as pizzas
		CarrinhoDeCompras c = new CarrinhoDeCompras();
        c.adicionaPizza(p1);
        c.adicionaPizza(p2);
        c.adicionaPizza(p3);
		c.valorTotal();

		System.out.println("Valor total do pedido é R$ " +c.total);
		System.out.println("Quantidade utilizada de ingredientes: " );
		
		
		for (String ingrediente : Pizza.contabilizaIngrediente.keySet()){
			
			int value = Pizza.contabilizaIngrediente.get(ingrediente);
            System.out.println(ingrediente + " -> " + value);
		}
	}

}
