
public class Carro {
	//Criando Atributos
	int potencia;
	int velocidade;
	String nome;
	
	//Criando Método
	void acelerar(){
		velocidade = velocidade + potencia; // ou velocidade += potencia;
	}
	
	//Criando Método
	void frear(){
		velocidade = velocidade / 2;
	}
	//Criando Método
	int getVelocidade(){
		return velocidade;
	}
	
	//Criando Método
	void imprimir(){
		System.out.println("O carro "+nome+ " está a velocidade de "+getVelocidade()+" Km/h");
	}
}
