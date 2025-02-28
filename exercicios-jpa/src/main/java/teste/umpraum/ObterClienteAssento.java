package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Cliente cliente = dao.obterPorId(1L);
		System.out.println(cliente.getAssento().getNome());
		System.out.println(cliente.getNome());
		dao.fechar();
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(4L);
		
		System.out.println(assento.getNome());
		System.out.println(assento.getCliente().getNome());
		daoAssento.fechar();
		
	}
}
