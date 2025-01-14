package fundamentos.DesafiosFundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(°F - 32) * 5/9 = °C
		// 32 sendo constante e o 5/9 constante, °F e °C em uma variavel
		final double FATOR = 5.0/9.0;
		final int DIFERENCA = 32;
		double temperaturaf = 50;
		double temperaturac = (temperaturaf - DIFERENCA) * FATOR;
		System.out.println(temperaturac);
		temperaturaf = 100;
		temperaturac = (temperaturaf - DIFERENCA) * FATOR;
		System.out.println(temperaturac);
		
	}
}
