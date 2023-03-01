package com.proyecto.app.spring.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.app.spring.entity.*;


public interface ProductoDAO extends JpaRepository<Producto,Long>{
	
}
