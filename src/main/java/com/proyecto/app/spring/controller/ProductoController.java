package com.proyecto.app.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.proyecto.app.spring.service.ProductoService;
import com.proyecto.app.spring.DTO.ProductoDTO;
import com.proyecto.app.spring.entity.*;
import java.util.*;
@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	public ResponseEntity <List<ProductoDTO>> readAll(){
		List<Producto> productos=productoService.findAll();
		List<ProductoDTO> productosDTO=new ArrayList<>();
		for(Producto producto: productos) {
			ProductoDTO productoDTO=new ProductoDTO(producto.getId(),producto.getNombre(),producto.getUnidadMedida()
					,producto.getCantidadProducto(),producto.getClaseProducto(),producto.getProveedor().getNombreP()
					,producto.getTrabajador().getNombre());
			productosDTO.add(productoDTO);
		}
		return ResponseEntity.ok().body(productosDTO);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable Long id){
		Optional<Producto> productoOptional=productoService.findById(id);
		if(!productoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		ProductoDTO productoDTO=new ProductoDTO(productoOptional.get().getId(),productoOptional.get().getNombre(),
				productoOptional.get().getUnidadMedida(),productoOptional.get().getCantidadProducto(),
				productoOptional.get().getClaseProducto(),productoOptional.get().getProveedor().getNombreP(),
				productoOptional.get().getTrabajador().getNombre());
		return ResponseEntity.ok().body(productoDTO);
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody Producto producto){
		productoService.save(producto);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody Producto producto,@PathVariable Long id){
		Optional<Producto> productoOptional= productoService.findById(id);
		if(!productoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		producto.setId(id);
		productoService.save(producto);
		return ResponseEntity.ok().build();
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		Optional<Producto> productoOptional= productoService.findById(id);
		if(!productoOptional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		productoService.deleteById(id);
		return ResponseEntity.ok().build();
		
	}
}
