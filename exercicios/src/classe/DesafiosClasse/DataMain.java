package classe.DesafiosClasse;



public class DataMain {
	public static void main(String[] args) {

		
		Data d1 = new Data(); 
		String dataFormatada = d1.dataFormatada();
		
		Data d2 = new Data(24, 12, 2024);
		String dataFormatada2 = d2.dataFormatada();
		
		System.out.println(dataFormatada);
		System.out.println(dataFormatada2);
	}
}
