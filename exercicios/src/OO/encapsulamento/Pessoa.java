package OO.encapsulamento;
//Aprendendo Get e Set
public class Pessoa {
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade ) {
		setNome(nome);
		setIdade(idade);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	//Getter
	public int getIdade() {
		return idade;
	}
	
	//Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 100) {
			this.idade = novaIdade;			
		}
	}
	
	@Override
	public String toString() {
		return "Ola meu nome é " + getNome() + " e tenho " + getIdade() + " anos.";
	}
}
