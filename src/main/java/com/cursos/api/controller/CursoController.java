package com.cursos.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cursos.api.dao.CursoDAO;
import com.cursos.api.model.Curso;

@RestController
public final class CursoController {

	@GetMapping("/cursos/{id}")
	public static Curso findById(@PathVariable Long id) {

		Curso curso;

		try {
			return CursoDAO.findById(id);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

	@PostMapping("/cursos/list")
	public List<Curso> findList() {
		
		try {
			return CursoDAO.findList();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return null;
	}

	@PostMapping("/cursos")
	public String insert(@RequestBody Curso curso) {
		
		try {
			return CursoDAO.insert(curso);
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "";
	}

	@PutMapping("/cursos/{id}")
	public Curso update(@RequestBody Curso curso) {
		try {
			return CursoDAO.update(curso);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		return null;
	}

	@DeleteMapping("/cursos/{id}")
	public String delete(@PathVariable Long id) {
		
		try {
			return CursoDAO.delete(id);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return "FAIL!";
	}

}
