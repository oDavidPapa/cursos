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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CUR_ID")
	private Long curId;
	
	@Column(name = "CUR_NOME", nullable = false)
	private String curNome;
	
	@Column(name = "CUR_DESCRICAO", nullable = false)
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curDescricao == null) ? 0 : curDescricao.hashCode());
		result = prime * result + ((curId == null) ? 0 : curId.hashCode());
		result = prime * result + ((curNome == null) ? 0 : curNome.hashCode());
		result = prime * result + ((curVideoUrl == null) ? 0 : curVideoUrl.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (curDescricao == null) {
			if (other.curDescricao != null)
				return false;
		} else if (!curDescricao.equals(other.curDescricao))
			return false;
		if (curId == null) {
			if (other.curId != null)
				return false;
		} else if (!curId.equals(other.curId))
			return false;
		if (curNome == null) {
			if (other.curNome != null)
				return false;
		} else if (!curNome.equals(other.curNome))
			return false;
		if (curVideoUrl == null) {
			if (other.curVideoUrl != null)
				return false;
		} else if (!curVideoUrl.equals(other.curVideoUrl))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [curId=" + curId + ", curNome=" + curNome + ", curDescricao=" + curDescricao + ", curVideoUrl="
				+ curVideoUrl + "]";
	}	
	

	
}
