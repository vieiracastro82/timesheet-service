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
@Table(name="CentroCusto")
@AttributeOverride(name = "id", column = @Column(name = "idCentroCusto"))
public class CentroCustoEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private String centroCusto;

	private Integer idReferenciaExterna;

	private Date dataCriacao;
	
	public CentroCustoEntity() {
	}

	public CentroCustoEntity(String centroCusto, Integer idReferenciaExterna,
			Date dataCriacao) {
		super();
		this.centroCusto = centroCusto;
		this.idReferenciaExterna = idReferenciaExterna;
		this.dataCriacao = dataCriacao;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
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


}
