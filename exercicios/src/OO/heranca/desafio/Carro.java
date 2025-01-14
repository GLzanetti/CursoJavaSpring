package OO.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual = 0;
	private int delta = 5;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}
	
	public void setDelta(int delta) {
		this.delta = delta;
	}

	boolean acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;		
		}
		return true;				
	}
	
	public boolean frear() {
		if(velocidadeAtual > 0) {
			velocidadeAtual -= 5;
			return true;
		} else if(velocidadeAtual - 5 < 0) {
			velocidadeAtual -= velocidadeAtual;
			return true;
		} else {
			return false;
		}
	}
}
