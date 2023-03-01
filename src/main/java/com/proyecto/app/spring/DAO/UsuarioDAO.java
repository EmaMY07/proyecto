package com.proyecto.app.spring.DAO;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.app.spring.entity.*;
@Repository
public interface UsuarioDAO extends JpaRepository<Usuario,Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
