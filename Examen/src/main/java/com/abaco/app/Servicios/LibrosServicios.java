package com.abaco.app.Servicios;

import com.abaco.app.modelos.Libros;
import com.abaco.app.repositorio.LibrosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brandon
 */

@Service
public class LibrosServicios {
    
    @Autowired
    private LibrosRepositorio librosRepositorio;
    
    public Libros Insertar(Libros lib) {
        return librosRepositorio.save(lib);
    }
    
    public Libros Actualizar(Libros lib) {
        return librosRepositorio.save(lib);
    }
    
    public List<Libros> listar() {
        return librosRepositorio.findAll();
    }
    
    public void eliminar(Libros lib) {
        librosRepositorio.delete(lib);
    }    
    
}
