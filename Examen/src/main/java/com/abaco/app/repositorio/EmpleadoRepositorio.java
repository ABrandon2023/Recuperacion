package com.abaco.app.repositorio;

import com.abaco.app.modelos.Empleados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brando
 */

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleados, Integer> {
    
}
