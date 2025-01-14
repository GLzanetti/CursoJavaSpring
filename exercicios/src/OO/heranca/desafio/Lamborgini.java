package OO.heranca.desafio;

public class Lamborgini extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAr;
	
	public Lamborgini(){
		this(415);
	}
	
	Lamborgini(int velocidadeMax){
		super(velocidadeMax);
		setDelta(15);
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
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarturbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		}else {
			return 15;
		}
	}
}
