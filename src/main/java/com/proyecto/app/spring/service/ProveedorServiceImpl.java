package com.proyecto.app.spring.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.app.spring.DAO.ProveedorDAO;
import com.proyecto.app.spring.entity.Proveedor;
@Service
public class ProveedorServiceImpl implements ProveedorService{
	@Autowired
	private ProveedorDAO proveedorDAO;
	@Override
	public List<Proveedor> findByNombrePContaining(String nombreP) {
		return proveedorDAO.findByNombrePContaining(nombreP);
	}

	@Override
	public List<Proveedor> findAll() {
		return proveedorDAO.findAll();
	}

	@Override
	public Optional<Proveedor> findById(Long idProveedor) {
		return proveedorDAO.findById(idProveedor);
	}

	@Override
	public Proveedor save(Proveedor proveedor) {
		return proveedorDAO.save(proveedor);
	}

	@Override
	public void deleteById(Long id) {
		proveedorDAO.deleteById(id);
	}
	
}
