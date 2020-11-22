package com.cursos.api.testes;

import javax.persistence.EntityManager;

import com.cursos.api.conexao.EntityManagerProvider;

public class CriaTabelaTest {

	public static void main(String[] args) {
		EntityManager em = EntityManagerProvider.getInstance().createManager();
		em.close();
		
	}

}
