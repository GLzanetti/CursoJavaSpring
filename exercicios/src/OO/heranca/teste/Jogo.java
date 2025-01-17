package OO.heranca.teste;

import OO.heranca.Heroi;
import OO.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Heroi heroi = new Heroi(10, 11);

		
		
		System.out.println(monstro.x+", "+monstro.y+", "+monstro.vida);
		System.out.println(heroi.x+", "+heroi.y+", "+heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
	}
}