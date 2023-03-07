package com.proyecto.app.spring.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.app.spring.entity.Trabajador;

public interface TrabajadorDAO extends JpaRepository<Trabajador,Long> {

}
