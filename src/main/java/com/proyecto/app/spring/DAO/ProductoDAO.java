package com.proyecto.app.spring.DAO;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.app.spring.entity.*;

@Repository
public interface ProductoDAO extends JpaRepository<Producto,Long>{
	
}
