package com.java.finance;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserDaoIfc userDaoIfc;
	
	//EntityManagerFactory emf = Persistence.createEntityManagerFactory("application.properties");
	//EntityManager em = emf.createEntityManager();
    
	@Transactional
	public void saveUser(User user) {
		System.out.println("in UserService method");
		//em.getTransaction().begin();
		//em.persist(user);
		userDaoIfc.save(user);
		//em.getTransaction().commit();
		System.out.println("after save method");
	}

	public List<User> getAll() {
		List<User> users = new ArrayList<>();
		userDaoIfc.findAll().forEach(users::add);
		return users;
	}
	
	

}
