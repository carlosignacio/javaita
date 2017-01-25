
public class ContaEspecial extends ContaCorrente {
	//Limite é o quanto eu posso ir negativo na conta;
	int limite; 

	//Criando um Construtor
	ContaEspecial(int limite) {
		this.limite = limite;
	}
	
	public int sacar(int valor){
		if(valor > (saldo+limite)){
			return 0;
		}else{
			saldo -= valor;
			return valor;
		}
	}
}
