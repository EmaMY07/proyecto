package com.proyecto.app.spring.DTO;



public class UsuarioDTO {
	private Long id;
	private String rol;
	private String usuario;
	private String contrasena;

	public UsuarioDTO() {
		super();
	}

	
	
	
	public UsuarioDTO(Long id, String rol, String usuario) {
		super();
		this.id = id;
		this.rol = rol;
		this.usuario = usuario;
	}




	public UsuarioDTO(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}




	public UsuarioDTO(Long id, String rol, String usuario, String contrasena) {
		super();
		this.id = id;
		this.rol = rol;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}




	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
