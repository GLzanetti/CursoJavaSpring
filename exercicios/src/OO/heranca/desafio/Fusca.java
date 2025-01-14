package OO.heranca.desafio;

public class Fusca extends Carro{
	
	public Fusca(){
		this(130);
	}
	
	Fusca(int velocidadeMax){
		super(velocidadeMax);
		setDelta(5);
	}
	
	@Override
	public boolean acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += getDelta();		
		}
		return true;				
	}
}
