package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Credito")
public class Credito extends Cartao{

	private boolean credito;

	public Credito() {
		
	}

	public Credito(String nome, boolean credito) {
		super(nome);
		this.credito = credito;
	}



	public boolean isCredito() {
		return credito;
	}

	public void setCredito(boolean credito) {
		this.credito = credito;
	}	
}
