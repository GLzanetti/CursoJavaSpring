package classe;

import classe.DesafiosClasse.Data;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 1, 1970);
		Data d2 = d1; //Atribuição por referencia(Objeto)
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		
		int c = 5;
		alterarPrimitivo(c); //Não vai gerar alteração
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
