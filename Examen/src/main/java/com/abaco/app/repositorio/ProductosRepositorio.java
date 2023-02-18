package com.abaco.app.repositorio;

import com.abaco.app.modelos.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brandon
 */

@Repository
public interface ProductosRepositorio extends JpaRepository<Productos, Integer>{
    
}
