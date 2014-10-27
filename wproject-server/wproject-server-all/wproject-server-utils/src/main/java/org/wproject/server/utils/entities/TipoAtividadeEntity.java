package org.wproject.server.utils.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;

@Entity
@XmlRootElement
@Table(name="TipoAtividade")
@AttributeOverride(name = "id", column = @Column(name = "idTipoAtividade"))
public class TipoAtividadeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private String tipoAtividade;

	public TipoAtividadeEntity() {
	}

	public TipoAtividadeEntity(String tipoAtividade) {
		super();
		this.tipoAtividade = tipoAtividade;
	}

	public String getTipoAtividade() {
		return tipoAtividade;
	}

	public void setTipoAtividade(String tipoAtividade) {
		this.tipoAtividade = tipoAtividade;
	}


}
