package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtor
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	//Contrutor Padrão
	Produto(){
		
	}
	
	//metodo	
	double precoComDesconto(){
		return preco*(1 - desconto);
	}
	//metodo
	double precoComDesconto(double descontoDoGerente){
		return preco*(1 - (desconto + descontoDoGerente));
	}
}
