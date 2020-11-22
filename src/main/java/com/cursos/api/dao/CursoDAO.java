package com.cursos.api.dao;

import java.util.Objects;

import com.cursos.api.model.Curso;

public final class CursoDAO extends EntityManagerFactoryProvider {
	

	public static Curso findById(Long id) throws Exception {
		Curso curso  = getEntityManager().find(Curso.class, id);
		
		if (Objects.isNull(curso))
			throw new Exception("OBJETO NÃO ENCONTRANDO NA BASE DE DADOS!");
		
		return curso;
		
	}
	
	public static String insert(Curso curso) throws Exception {
		

		if(!getEntityManager().getTransaction().isActive())
			getEntityManager().getTransaction().begin();
		getEntityManager().persist(curso);
		getEntityManager().getTransaction().commit();
		getEntityManager().close();
		
		return "SUCESSO!";
	}
}
