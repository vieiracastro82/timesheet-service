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
@Table(name="Parametros")
@AttributeOverride(name = "id", column = @Column(name = "idParametros"))
public class ParametrosEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private Date dataCriacao;
	
	private Integer limiteTentativasSenha;

	private Integer percentualAdicionalDesvioAtividadeHora;

	private Integer percentualAdicionalDesvioProjetoHora;

	private Integer diasToleranciaAtrasoLancamentos;

	public ParametrosEntity() {
	}

	public ParametrosEntity(Date dataCriacao, Integer limiteTentativasSenha,
			Integer percentualAdicionalDesvioAtividadeHora,
			Integer percentualAdicionalDesvioProjetoHora,
			Integer diasToleranciaAtrasoLancamentos) {
		this.dataCriacao = dataCriacao;
		this.limiteTentativasSenha = limiteTentativasSenha;
		this.percentualAdicionalDesvioAtividadeHora = percentualAdicionalDesvioAtividadeHora;
		this.percentualAdicionalDesvioProjetoHora = percentualAdicionalDesvioProjetoHora;
		this.diasToleranciaAtrasoLancamentos = diasToleranciaAtrasoLancamentos;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getLimiteTentativasSenha() {
		return limiteTentativasSenha;
	}

	public void setLimiteTentativasSenha(Integer limiteTentativasSenha) {
		this.limiteTentativasSenha = limiteTentativasSenha;
	}

	public Integer getPercentualAdicionalDesvioAtividadeHora() {
		return percentualAdicionalDesvioAtividadeHora;
	}

	public void setPercentualAdicionalDesvioAtividadeHora(
			Integer percentualAdicionalDesvioAtividadeHora) {
		this.percentualAdicionalDesvioAtividadeHora = percentualAdicionalDesvioAtividadeHora;
	}

	public Integer getPercentualAdicionalDesvioProjetoHora() {
		return percentualAdicionalDesvioProjetoHora;
	}

	public void setPercentualAdicionalDesvioProjetoHora(
			Integer percentualAdicionalDesvioProjetoHora) {
		this.percentualAdicionalDesvioProjetoHora = percentualAdicionalDesvioProjetoHora;
	}

	public Integer getDiasToleranciaAtrasoLancamentos() {
		return diasToleranciaAtrasoLancamentos;
	}

	public void setDiasToleranciaAtrasoLancamentos(
			Integer diasToleranciaAtrasoLancamentos) {
		this.diasToleranciaAtrasoLancamentos = diasToleranciaAtrasoLancamentos;
	}


}
