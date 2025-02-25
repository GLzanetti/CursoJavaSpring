package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		em.getTransaction().begin();
		usuario.setNome("Luca");
		usuario.setEmail("luca@gmail.com");
		
		em.merge(usuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
