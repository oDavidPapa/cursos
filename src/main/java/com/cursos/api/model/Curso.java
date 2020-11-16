package com.cursos.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CURSO")
public class Curso implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CUR_ID")
	private Long curId;
	
	@Column(name = "CUR_NOME", nullable = false)
	private String curNome;
	
	@Column(name = "CUR_DESC", nullable = false)
	private String curDescricao;
	
	@Column(name = "CUR_VIDEO_URL")
	private String curVideoUrl;

	public Long getCurId() {
		return curId;
	}

	public void setCurId(Long curId) {
		this.curId = curId;
	}

	public String getCurNome() {
		return curNome;
	}

	public void setCurNome(String curNome) {
		this.curNome = curNome;
	}

	public String getCurDescricao() {
		return curDescricao;
	}

	public void setCurDescricao(String curDescricao) {
		this.curDescricao = curDescricao;
	}

	public String getCurVideoUrl() {
		return curVideoUrl;
	}

	public void setCurVideoUrl(String curVideoUrl) {
		this.curVideoUrl = curVideoUrl;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	

	
	
}
