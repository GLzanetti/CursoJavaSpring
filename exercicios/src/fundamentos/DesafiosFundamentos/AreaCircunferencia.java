package fundamentos.DesafiosFundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		int raio = 3;
		final double PI = 3.14; 
		/*após adicionar final no começo de uma 
		variável ela se torna uma constate,
		ou seja, ela não irá mudar mais */
		//E é uma boa prática colocar nomes de constantes com letra maiúscula
		double area = PI*raio*raio;
		System.out.println(area);
		
		raio = 10;
		area = PI*raio*raio;
		System.out.println("Área = " + area+"m²");
	}
}
