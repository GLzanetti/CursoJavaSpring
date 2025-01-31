package generics;
//Não é muito comum crir o generics com Palavras mas sim Letras
public class Caixa<T> {
	
	private T coisa;
	
	public void guardar(T coisa) {
		this.coisa = coisa;
	}
	
	public T abrir() {
		return coisa;
	}
}
