package br.com.fiap.projeto_usuarios.model;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class UsuarioChaveComposta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id_usuario;
	private String rm;

	public UsuarioChaveComposta() {

	}

	public UsuarioChaveComposta(Long id_usuario, String rm) {
		super();
		this.id_usuario = id_usuario;
		this.rm = rm;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}

}
