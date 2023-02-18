package com.abaco.app.repositorio;

import com.abaco.app.modelos.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Brandon
 */

@Repository
public interface LibrosRepositorio extends JpaRepository<Libros, Integer> {
    
}
