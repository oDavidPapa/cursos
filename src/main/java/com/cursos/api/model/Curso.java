package com.cursos.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Column(name = "CUR_TIPO")
	@Enumerated(EnumType.STRING)
	private ETipoCurso curTipo;
	
	@Column(name = "CUR_DATA_ATUALIZACAO")
	private LocalDate curDataAtualizacao;
	
	@Column(name = "CUR_VALOR")
	private BigDecimal curValor;

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
	
	
	public ETipoCurso getCurTipo() {
		return curTipo;
	}

	public void setCurTipo(ETipoCurso curTipo) {
		this.curTipo = curTipo;
	}

	public LocalDate getCurDataAtualizacao() {
		return curDataAtualizacao;
	}

	public void setCurDataAtualizacao(LocalDate curDataAtualizacao) {
		this.curDataAtualizacao = curDataAtualizacao;
	}

	public BigDecimal getCurValor() {
		return curValor;
	}

	public void setCurValor(BigDecimal curValor) {
		this.curValor = curValor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((curDataAtualizacao == null) ? 0 : curDataAtualizacao.hashCode());
		result = prime * result + ((curDescricao == null) ? 0 : curDescricao.hashCode());
		result = prime * result + ((curId == null) ? 0 : curId.hashCode());
		result = prime * result + ((curNome == null) ? 0 : curNome.hashCode());
		result = prime * result + ((curTipo == null) ? 0 : curTipo.hashCode());
		result = prime * result + ((curValor == null) ? 0 : curValor.hashCode());
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
		if (curDataAtualizacao == null) {
			if (other.curDataAtualizacao != null)
				return false;
		} else if (!curDataAtualizacao.equals(other.curDataAtualizacao))
			return false;
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
		if (curTipo != other.curTipo)
			return false;
		if (curValor == null) {
			if (other.curValor != null)
				return false;
		} else if (!curValor.equals(other.curValor))
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
				+ curVideoUrl + ", curTipo=" + curTipo + ", curDataAtualizacao=" + curDataAtualizacao + ", curValor="
				+ curValor + "]";
	}

	

	
}
