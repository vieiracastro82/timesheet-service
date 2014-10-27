package org.wproject.server.utils.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.wproject.server.utils.BaseEntity;

@Entity
@XmlRootElement
@Table(name="SituacaoAtividade")
@AttributeOverride(name = "id", column = @Column(name = "idSituacaoAtividade"))
public class SituacaoAtividadeEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private String situacaoAtividade;

	public SituacaoAtividadeEntity() {
	}

	public SituacaoAtividadeEntity(String situacaoAtividade) {
		super();
		this.situacaoAtividade = situacaoAtividade;
	}

	public String getSituacaoAtividade() {
		return situacaoAtividade;
	}

	public void setSituacaoAtividade(String situacaoAtividade) {
		this.situacaoAtividade = situacaoAtividade;
	}


}
