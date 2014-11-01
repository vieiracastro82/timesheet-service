package org.wproject.server.utils.entities;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;

@Entity
@XmlRootElement
@Table(name="TrabalhoRealizado")
@AttributeOverride(name = "id", column = @Column(name = "idTrabalhoRealizado"))
public class TrabalhoRealizadoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	@ManyToOne(optional=false)
	@JoinColumn(name = "idAtividade")
	private AtividadeEntity atividade;

	@ManyToOne(optional=false)
	@JoinColumn(name = "idUsuario")
	private UsuarioEntity usuario;

	private Date dataHoraLancamento;
	
	private Date inicioTrabalho;
	
	private Date fimTrabalho;
	
	private Integer tempoTrabalhado;

	private String observacoes;

	public TrabalhoRealizadoEntity() {
	}

	public TrabalhoRealizadoEntity(AtividadeEntity atividade,
			UsuarioEntity usuario, Date dataHoraLancamento,
			Date inicioTrabalho, Date fimTrabalho, Integer tempoTrabalhado,
			String observacoes) {
		super();
		this.atividade = atividade;
		this.usuario = usuario;
		this.dataHoraLancamento = dataHoraLancamento;
		this.inicioTrabalho = inicioTrabalho;
		this.fimTrabalho = fimTrabalho;
		this.tempoTrabalhado = tempoTrabalhado;
		this.observacoes = observacoes;
	}

	public AtividadeEntity getAtividade() {
		return atividade;
	}

	public void setAtividade(AtividadeEntity atividade) {
		this.atividade = atividade;
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	public Date getDataHoraLancamento() {
		return dataHoraLancamento;
	}

	public void setDataHoraLancamento(Date dataHoraLancamento) {
		this.dataHoraLancamento = dataHoraLancamento;
	}

	public Date getInicioTrabalho() {
		return inicioTrabalho;
	}

	public void setInicioTrabalho(Date inicioTrabalho) {
		this.inicioTrabalho = inicioTrabalho;
	}

	public Date getFimTrabalho() {
		return fimTrabalho;
	}

	public void setFimTrabalho(Date fimTrabalho) {
		this.fimTrabalho = fimTrabalho;
	}

	public Integer getTempoTrabalhado() {
		return tempoTrabalhado;
	}

	public void setTempoTrabalhado(Integer tempoTrabalhado) {
		this.tempoTrabalhado = tempoTrabalhado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


}
