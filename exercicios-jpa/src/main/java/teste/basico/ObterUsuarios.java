package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		 * 	Fazer o comando com uma linha só;
		 *  List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(5).query.getResultList();
		 */
		
		String jpql = "select u from Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println(usuario.getId() + " = " + usuario.getNome() + " " + usuario.getEmail());
		}
		
		em.close();
		emf.close();
	}
}
