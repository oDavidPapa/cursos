package com.cursos.api.dao;

import java.util.List;
import java.util.Objects;

import javax.persistence.Query;

import com.cursos.api.model.Curso;

public final class CursoDAO extends EntityManagerFactoryProvider {

	public static Curso findById(Long id) throws Exception {

		Curso curso = getEntityManager().find(Curso.class, id);

		if (Objects.isNull(curso)) {
			throw new Exception("OBJETO NÃO ENCONTRANDO NA BASE DE DADOS!");
		}
		
		return curso;

	}

	public static String insert(Curso curso) throws Exception {

		if (!getEntityManager().getTransaction().isActive())
			getEntityManager().getTransaction().begin();

		getEntityManager().persist(curso);
		getEntityManager().getTransaction().commit();

		return "SUCESSO!";
	}

	public static List<Curso> findList() throws Exception {
		
		String jpql = "SELECT c FROM Curso c";
		
		Query query = getEntityManager().createQuery(jpql);
		List<Curso> resultList =  query.getResultList();

		return resultList;
	}
	
	public static Curso update(Curso curso) throws Exception {
		
		Curso cusoUpdate =  CursoDAO.findById(curso.getCurId());
		
		cusoUpdate.setCurDescricao(curso.getCurDescricao());
		cusoUpdate.setCurNome(curso.getCurNome());
		cusoUpdate.setCurDataAtualizacao(curso.getCurDataAtualizacao());
		cusoUpdate.setCurTipo(curso.getCurTipo());
		cusoUpdate.setCurVideoUrl(curso.getCurVideoUrl());
		cusoUpdate.setCurValor(curso.getCurValor());
		
		if(!getEntityManager().getTransaction().isActive())
			getEntityManager().getTransaction().begin();
		getEntityManager().persist(cusoUpdate);
		getEntityManager().getTransaction().commit();
		
		return cusoUpdate;
	
	}
	
	public static String delete(Long id) throws Exception {
		Curso cursoDelete = CursoDAO.findById(id);
		
		getEntityManager().getTransaction().begin();
		getEntityManager().remove(cursoDelete);
		getEntityManager().getTransaction().commit();
		
		return "SUCESSO!";
	}
}
