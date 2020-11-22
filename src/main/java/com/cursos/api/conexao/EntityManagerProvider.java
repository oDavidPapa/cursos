package com.cursos.api.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class  EntityManagerProvider {
	
	private static final EntityManagerProvider INSTANCE = new EntityManagerProvider();
	private final EntityManagerFactory factory;
	
	private EntityManagerProvider() {
		this.factory = Persistence.createEntityManagerFactory("cursos");
	}
	
	
	public static EntityManagerProvider getInstance() {
        return INSTANCE;
    }

    public EntityManagerFactory getFactory() {
        return factory;
    }

    public EntityManager createManager() {
        return factory.createEntityManager();
    }
    
    public void closeConnection() {
    	this.factory.close();
    }
}
