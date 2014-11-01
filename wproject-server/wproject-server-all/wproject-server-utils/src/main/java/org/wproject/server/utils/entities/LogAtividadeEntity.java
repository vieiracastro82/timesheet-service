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
@Table(name="LogAtividade")
@AttributeOverride(name = "id", column = @Column(name = "idLogAtividade"))
public class LogAtividadeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private Date dataCriacao;
	
	private String acao;

	@ManyToOne(optional=false)
	@JoinColumn(name = "idAtividadeAfetada")
	private AtividadeEntity atividadeAfetada;

	@ManyToOne(optional=false)
	@JoinColumn(name = "idUsuarioResponsavel")
	private UsuarioEntity usuarioResponsavel;
	
	

	public LogAtividadeEntity() {
	}

	public LogAtividadeEntity(Date dataCriacao, String acao,
			AtividadeEntity atividadeAfetada, UsuarioEntity usuarioResponsavel) {
		super();
		this.dataCriacao = dataCriacao;
		this.acao = acao;
		this.atividadeAfetada = atividadeAfetada;
		this.usuarioResponsavel = usuarioResponsavel;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public AtividadeEntity getAtividadeAfetada() {
		return atividadeAfetada;
	}

	public void setAtividadeAfetada(AtividadeEntity atividadeAfetada) {
		this.atividadeAfetada = atividadeAfetada;
	}

	public UsuarioEntity getUsuarioResponsavel() {
		return usuarioResponsavel;
	}

	public void setUsuarioResponsavel(UsuarioEntity usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

	
}
