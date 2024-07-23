package br.com.alura.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import br.com.alura.domain.User;

@Repository
public class UserDao {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void cadastrar(User user) {
		this.em.persist(user);
	}
	
	@Transactional
	public User buscarPorId(Long id) {
		System.out.println("Fetching user with ID: " + id);
	    User user = em.find(User.class, id);
	    if (user == null) {
	        System.out.println("User not found");
	    } else {
	        System.out.println("User found");
	    }
	    return user;
	}

}
