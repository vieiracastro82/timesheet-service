package org.wproject.server.utils.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.annotate.JsonManagedReference;
import org.wproject.server.utils.BaseEntity;

@Entity
@XmlRootElement
@Table(name="Atividade")
@AttributeOverride(name = "id", column = @Column(name = "idAtividade"))
public class AtividadeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private String atividade;

	private String descricao;

	private Integer esforcoPrevisto;

	private Date dataPrevista;
	
	private String solicitante;

	private Integer idReferenciaExterna;

	@ManyToOne(optional=true)
	@JoinColumn(name = "idProjeto")
	private ProjetoEntity projeto;

	@ManyToOne(optional=false)
	@JoinColumn(name = "idSituacaoAtividade")
	private SituacaoAtividadeEntity situacaoAtividade;

	@ManyToOne(optional=false)
	@JoinColumn(name = "idTipoAtividade")
	private TipoAtividadeEntity tipoAtividade;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "atividade")
	@JsonManagedReference
	private List<ResponsavelAtividadeEntity> responsavelAtividade;
	
	public AtividadeEntity() {
	}

	public AtividadeEntity(String atividade, String descricao,
			Integer esforcoPrevisto, Date dataPrevista, String solicitante,
			Integer idReferenciaExterna, ProjetoEntity projeto,
			SituacaoAtividadeEntity situacaoAtividade,
			TipoAtividadeEntity tipoAtividade,
			List<ResponsavelAtividadeEntity> responsavelAtividade) {
		this.atividade = atividade;
		this.descricao = descricao;
		this.esforcoPrevisto = esforcoPrevisto;
		this.dataPrevista = dataPrevista;
		this.solicitante = solicitante;
		this.idReferenciaExterna = idReferenciaExterna;
		this.projeto = projeto;
		this.situacaoAtividade = situacaoAtividade;
		this.tipoAtividade = tipoAtividade;
		this.responsavelAtividade = responsavelAtividade;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getEsforcoPrevisto() {
		return esforcoPrevisto;
	}

	public void setEsforcoPrevisto(Integer esforcoPrevisto) {
		this.esforcoPrevisto = esforcoPrevisto;
	}

	public Date getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(Date dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Integer getIdReferenciaExterna() {
		return idReferenciaExterna;
	}

	public void setIdReferenciaExterna(Integer idReferenciaExterna) {
		this.idReferenciaExterna = idReferenciaExterna;
	}

	public ProjetoEntity getProjeto() {
		return projeto;
	}

	public void setProjeto(ProjetoEntity projeto) {
		this.projeto = projeto;
	}

	public SituacaoAtividadeEntity getSituacaoAtividade() {
		return situacaoAtividade;
	}

	public void setSituacaoAtividade(SituacaoAtividadeEntity situacaoAtividade) {
		this.situacaoAtividade = situacaoAtividade;
	}

	public TipoAtividadeEntity getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(TipoAtividadeEntity tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}

	public List<ResponsavelAtividadeEntity> getResponsavelAtividade() {
		return responsavelAtividade;
	}

	public void setResponsavelAtividade(
			List<ResponsavelAtividadeEntity> responsavelAtividade) {
		this.responsavelAtividade = responsavelAtividade;
	}


}
