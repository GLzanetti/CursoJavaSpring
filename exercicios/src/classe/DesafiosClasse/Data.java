package classe.DesafiosClasse;

public class Data {
	
	public int dia;
	public int mes;
	public int ano;
	
	Data(){
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1,1,1970);// esse this() só serve dentro de um construtor
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;//esse this é para referenciar a instancia e nao os parametros
		this.mes = mes;
		this.ano = ano;
	}
	
	public String dataFormatada() {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
}
