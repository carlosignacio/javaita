
public class Carro {
	//Criando Atributos
	int potencia;
	int velocidade;
	String nome;
	
	//Criando M�todo
	void acelerar(){
		velocidade = velocidade + potencia; // ou velocidade += potencia;
	}
	
	//Criando M�todo
	void frear(){
		velocidade = velocidade / 2;
	}
	//Criando M�todo
	int getVelocidade(){
		return velocidade;
	}
	
	//Criando M�todo
	void imprimir(){
		System.out.println("O carro "+nome+ " est� a velocidade de "+getVelocidade()+" Km/h");
	}
}
