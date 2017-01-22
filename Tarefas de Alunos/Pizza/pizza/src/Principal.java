
public class Principal {

	public static void main(String[] args) {

		// Define as variaveis do sistema
		Pizza portuguesa = new Pizza();
		Pizza mussarela = new Pizza();
		Pizza calabresa = new Pizza();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

		// Atribuição dos valores necessarios
		portuguesa.adicionaIngrediente("molho de tomate");
		portuguesa.adicionaIngrediente("queijo");
		portuguesa.adicionaIngrediente("presunto");
		portuguesa.adicionaIngrediente("tomate");
		portuguesa.adicionaIngrediente("cebola");
		portuguesa.adicionaIngrediente("oregano");
		portuguesa.adicionaIngrediente("ovo");
		portuguesa.adicionaIngrediente("palmito");

		mussarela.adicionaIngrediente("molho de tomate");
		mussarela.adicionaIngrediente("queijo");

		calabresa.adicionaIngrediente("molho de tomate");
		calabresa.adicionaIngrediente("calabresa");
		calabresa.adicionaIngrediente("cebola");

		carrinho.add(portuguesa);
		carrinho.add(mussarela);
		carrinho.add(calabresa);

		// Saida de dados
		System.out.println("Valor total do carrinho de compras: R$ " + carrinho.getValorTotal());

		System.out.println("\nQuantidade utilizada de cada ingrediente");
		for (String ingrediente : Pizza.contabilizaIngrediente.keySet()) {
			System.out.println(ingrediente + " -> " + Pizza.contabilizaIngrediente.get(ingrediente));
		}

	}

}
