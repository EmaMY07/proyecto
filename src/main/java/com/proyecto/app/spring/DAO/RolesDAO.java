package com.proyecto.app.spring.DAO;

import com.proyecto.app.spring.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesDAO extends JpaRepository<Roles,Long> {
}
