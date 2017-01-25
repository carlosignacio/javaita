package outro;

import pacote.Referencia;

public class Sub extends Referencia{
	
	//Criando método
	public void testeAcesso(){
		//r.modificadorDefault = 0;
		modificadorPublico = 0; 
		//r.modificadorPrivado = 0; não é visível
		modificadorProtegido = 0; 
		
	}

}
