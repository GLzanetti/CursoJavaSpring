package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	//Por ser uma heranca nao precisamos instanciar uma Ana aqui
	
	//e se tentarmos acessar um atributo protected por uma instacia
	//ele nao ira funcionar.
	void acessos() {
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
	
}
