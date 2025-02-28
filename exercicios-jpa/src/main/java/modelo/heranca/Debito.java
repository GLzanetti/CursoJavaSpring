package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Debito")
public class Debito extends Cartao{
	
	private boolean debito;
	
	public Debito() {
		
	}

	public Debito(String nome, boolean debito) {
		super(nome);
		this.debito = debito;
	}



	public boolean isDebito() {
		return debito;
	}

	public void setDebito(boolean debito) {
		this.debito = debito;
	}
}
