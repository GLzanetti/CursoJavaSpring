package OO.heranca;

public class Monstro extends Jogador{
	
	public Monstro(){
		super(0, 0);
	}
	
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
}
