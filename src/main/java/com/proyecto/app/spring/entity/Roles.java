package com.proyecto.app.spring.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="roles")
public class Roles {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Rol")
	private Long id;
	
	@Column(name="Nombre_Rol",nullable=false,length=10)
	private String nombreRol;
	
	@OneToMany(mappedBy = "rol", cascade = CascadeType.ALL)
	private Set<Usuario> usuarios = new HashSet<>();

	public Roles() {
		super();
	}

	public Roles(Long id, String nombreRol, Set<Usuario> usuarios) {
		super();
		this.id = id;
		this.nombreRol = nombreRol;
		this.usuarios = usuarios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
	
}
