package com.proyecto.app.spring.entity;

import jakarta.persistence.*;

@Entity
@Table(name="proveedor")
public class Proveedor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProveedor;
	
	@Column(name="nombre_p", nullable=false,length=100)
	private String nombreP;
	
	@Column(name="ruc",nullable=false,length=11)
	private String ruc;
	
	@Column(name="direccion",nullable=false,length=50)
	private String direccion;
	
	@Column(name="telefono",nullable=false,length=9)
	private String telefono;
	
	@Column(name="correo",nullable=false,length=50)
	private String correo;
	
	public Long getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreP() {
		return nombreP;
	}
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
