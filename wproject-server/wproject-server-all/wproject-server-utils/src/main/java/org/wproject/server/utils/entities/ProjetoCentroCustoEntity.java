package org.wproject.server.utils.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;
import org.wproject.server.utils.entities.keys.ProjetoCentroCustoKeyEntity;

@Entity
@XmlRootElement
@Table(name="ProjetoCentroCusto")
public class ProjetoCentroCustoEntity extends BaseEntity<ProjetoCentroCustoKeyEntity> {

	private static final long serialVersionUID = -7596122831728650013L;

	private Date dataCriacao;
	
	public ProjetoCentroCustoEntity() {
	}

	public ProjetoCentroCustoEntity(Date dataCriacao) {
		super();
		this.dataCriacao = dataCriacao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
