package teste.heranca;

import infra.DAO;
import modelo.heranca.Cartao;
import modelo.heranca.Credito;
import modelo.heranca.Debito;

public class NovoCartao {
	public static void main(String[] args) {
		
		DAO<Cartao> dao = new DAO<>();
		
		Cartao cartao = new Cartao("Gabriel");
		Credito cartao1 = new Credito("Angelo", true);
		Debito cartao2 = new Debito("Maria", true);
		
		dao.incluirAtomico(cartao);
		dao.incluirAtomico(cartao1);
		dao.incluirAtomico(cartao2);

		dao.fechar();
	}
}
