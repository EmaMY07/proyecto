package com.proyecto.app.spring.DTO;

import java.math.BigDecimal;

public class ProductoDTO {
	private Long id;
	private String nombre;
	private BigDecimal unidadMedida;
	private int cantidadProducto;
	private String claseProducto;
	private String nombreProveedor;
	private String nombreTrabajador;
	
	public ProductoDTO() {
		super();
	}

	public ProductoDTO(Long id, String nombre, BigDecimal unidadMedida, int cantidadProducto, String claseProducto,
			String nombreProveedor, String nombreTrabajador) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.unidadMedida = unidadMedida;
		this.cantidadProducto = cantidadProducto;
		this.claseProducto = claseProducto;
		this.nombreProveedor = nombreProveedor;
		this.nombreTrabajador = nombreTrabajador;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(BigDecimal unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getClaseProducto() {
		return claseProducto;
	}

	public void setClaseProducto(String claseProducto) {
		this.claseProducto = claseProducto;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getNombreTrabajador() {
		return nombreTrabajador;
	}

	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}
	
	
}
