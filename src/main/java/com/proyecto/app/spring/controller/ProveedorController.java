package com.proyecto.app.spring.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.proyecto.app.spring.entity.Proveedor;
import com.proyecto.app.spring.service.ProveedorService;
@CrossOrigin(origins = "*") /*cualquier url puede acceder a la api rest*/
@RestController
@RequestMapping("/api/proveedor")
public class ProveedorController {
	@Autowired
	private ProveedorService proveedorService;
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Proveedor proveedor){
		return ResponseEntity.status(HttpStatus.CREATED).body(proveedorService.save(proveedor));
	}
	
	@GetMapping
	public List<Proveedor> readAll(){
		List<Proveedor> proveedores=proveedorService.findAll();
		return proveedores;
	}
	@GetMapping("/{nombreP}")
	public ResponseEntity<?> read(@PathVariable String nombreP) {
		List<Proveedor> proveedores=proveedorService.findByNombrePContaining(nombreP);
		return ResponseEntity.ok(proveedores);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Proveedor proveedorDetails,@PathVariable Long id){
		Optional<Proveedor> oproveedor=proveedorService.findById(id);
		if(!oproveedor.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		oproveedor.get().setNombreP(proveedorDetails.getNombreP());
		oproveedor.get().setRuc(proveedorDetails.getRuc());
		oproveedor.get().setDireccion(proveedorDetails.getDireccion());
		oproveedor.get().setTelefono(proveedorDetails.getTelefono());
		oproveedor.get().setCorreo(proveedorDetails.getCorreo());
	    return ResponseEntity.status(HttpStatus.CREATED).body(proveedorService.save(oproveedor.get()));
	}
	@DeleteMapping("{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		if(!proveedorService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
	    proveedorService.deleteById(id);
	    return ResponseEntity.ok().build();
	}
}
