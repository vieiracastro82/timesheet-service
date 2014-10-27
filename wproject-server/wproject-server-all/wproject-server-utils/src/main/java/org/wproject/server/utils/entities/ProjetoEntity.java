package org.wproject.server.utils.entities;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;

@Entity
@XmlRootElement
@Table(name="Projeto")
@AttributeOverride(name = "id", column = @Column(name = "idProjeto"))
public class ProjetoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private String projeto;

	private Integer idReferenciaExterna;

	private Date dataCriacao;
	
	private String situacao;
	
	private Integer percentualAdicionalDesvioHora;

	private Boolean usarDesvioHoraPadrao;	
	
	public ProjetoEntity() {
	}

	public ProjetoEntity(String projeto, Integer idReferenciaExterna,
			Date dataCriacao, String situacao,
			Integer percentualAdicionalDesvioHora, Boolean usarDesvioHoraPadrao) {
		super();
		this.projeto = projeto;
		this.idReferenciaExterna = idReferenciaExterna;
		this.dataCriacao = dataCriacao;
		this.situacao = situacao;
		this.percentualAdicionalDesvioHora = percentualAdicionalDesvioHora;
		this.usarDesvioHoraPadrao = usarDesvioHoraPadrao;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public Integer getIdReferenciaExterna() {
		return idReferenciaExterna;
	}

	public void setIdReferenciaExterna(Integer idReferenciaExterna) {
		this.idReferenciaExterna = idReferenciaExterna;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public Integer getPercentualAdicionalDesvioHora() {
		return percentualAdicionalDesvioHora;
	}

	public void setPercentualAdicionalDesvioHora(
			Integer percentualAdicionalDesvioHora) {
		this.percentualAdicionalDesvioHora = percentualAdicionalDesvioHora;
	}

	public Boolean getUsarDesvioHoraPadrao() {
		return usarDesvioHoraPadrao;
	}

	public void setUsarDesvioHoraPadrao(Boolean usarDesvioHoraPadrao) {
		this.usarDesvioHoraPadrao = usarDesvioHoraPadrao;
	}



}
