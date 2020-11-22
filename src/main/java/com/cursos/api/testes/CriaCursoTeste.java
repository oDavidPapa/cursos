package com.cursos.api.testes;

import com.cursos.api.dao.EntityManagerFactoryProvider;
import com.cursos.api.model.Curso;

public class CriaCursoTeste extends EntityManagerFactoryProvider {
	
	public static void main(String[] args) {
		

		Curso curso = new Curso();
		curso.setCurNome("Curso de Spring 2022");
		curso.setCurDescricao("Curso de Spring MVC com Angular JS");
		curso.setCurVideoUrl("www.youtube.com");
		
		
		getEntityManager().getTransaction().begin();
		
		getEntityManager().persist(curso);
		
		getEntityManager().getTransaction().commit();
		
	}

}
