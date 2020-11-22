package com.cursos.api.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerFactoryProvider {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("cursos");
	private static EntityManager entityManager = entityManagerFactory.createEntityManager();

	
	public static EntityManager getEntityManager() {
		return entityManager;
	}

}
