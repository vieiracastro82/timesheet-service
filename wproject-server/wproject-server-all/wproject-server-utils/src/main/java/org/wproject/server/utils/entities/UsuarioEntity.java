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
@Table(name="Usuario")
@AttributeOverride(name = "id", column = @Column(name = "idUsuario"))
public class UsuarioEntity extends BaseEntity<Long> {

	private static final long serialVersionUID = -7596122831728650013L;

	private String usuario;

	private String email;

	private String senha;

	private Date dataCriacao;
	
	public UsuarioEntity() {
	}

	public UsuarioEntity(String usuario, String email, String senha,
			Date dataCriacao) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.senha = senha;
		this.dataCriacao = dataCriacao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


}
