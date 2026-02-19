package br.com.fiap.projeto_usuarios.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@EmbeddedId
	private UsuarioChaveComposta chave;
	private String senha;
	private boolean ativo;
	@Enumerated(EnumType.STRING)
	private StatusAcademicoEnum status_academico;
	@ManyToOne
	@JoinColumn(name = "fk_pessoa")
	private Pessoa pessoa;
	private String email;

	public Usuario() {

	}

	public Usuario(UsuarioChaveComposta chave, String senha, boolean ativo, StatusAcademicoEnum status_academico,
			Pessoa pessoa, String email) {
		super();
		this.chave = chave;
		this.senha = senha;
		this.ativo = ativo;
		this.status_academico = status_academico;
		this.pessoa = pessoa;
		this.email = email;
	}

	public UsuarioChaveComposta getChave() {
		return chave;
	}

	public void setChave(UsuarioChaveComposta chave) {
		this.chave = chave;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public StatusAcademicoEnum getStatus_academico() {
		return status_academico;
	}

	public void setStatus_academico(StatusAcademicoEnum status_academico) {
		this.status_academico = status_academico;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
