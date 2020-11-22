package com.cursos.api.testes;

import com.cursos.api.dao.EntityManagerFactoryProvider;
import com.cursos.api.model.Curso;

public class BuscaCursoTest extends EntityManagerFactoryProvider {
	
	public static void main(String[] args) {
		
		
		Curso curso = getEntityManager().find(Curso.class, 1L);
		
		System.out.println(curso.toString());
		
	}

}
