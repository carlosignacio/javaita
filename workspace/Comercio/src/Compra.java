
public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	//Construtores
	//a vista
	public Compra(int valor){
		valorTotal = valor;
		numeroParcelas = 1;
	}

	//Construtores
	//parcelado
	public Compra(int qtdParcelas, int valorParcela){
		numeroParcelas = qtdParcelas;
		valorTotal = valorParcela * qtdParcelas;
	}
	
	//M�todos GET
	public int getValorTotal(){
		return valorTotal;
	}
	
	//M�todos GET
	public int getNumeroParcelas(){
		return numeroParcelas;
	}
	
	//M�todos GET
	public int getValorParcela(){
		return valorTotal/numeroParcelas;
	}
}
