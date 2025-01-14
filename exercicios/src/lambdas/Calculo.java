package lambdas;

//So permite um metodo em um Interface para criar lambdas
@FunctionalInterface 
public interface Calculo {
	
	public abstract double executar(double a, double b);
	
//Mesmo sendo uma interface funcional é possível criar metodos default
//e metodos static
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito Legal";
	}
}
