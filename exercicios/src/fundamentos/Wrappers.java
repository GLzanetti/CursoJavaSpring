package fundamentos;

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {

//		Scanner entrada = new Scanner(System.in);

		// Transformando os tipos primitivos para um objeto
		Byte b = 100; // Primitivo = byte (b minúsculo)
		Short s = 1000; // Primitivo = short (s minúsculo)
		Integer i = 10000; // Primitivo = int //Integer.parseInt(entrada.nextLine());
		Long l = 100000L; // Primitivo = long (l minúsculo)

		// Transformados agora podemos usar a notação ponto
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i + 3);
		System.out.println(l);

//		entrada.close();
		
		Float f = 123.456F; //Primitivo = float (f minúculo)
		System.out.println(f);
		Double d = 456.789; //Primitivo = double (d minúculo)
		System.out.println(d																																						);
		
		Boolean bo = Boolean.parseBoolean("true");//Primitivo = boolean (b minúculo)
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //Primitivo = char
				System.out.println(c);
	}
}
