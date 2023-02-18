package com.abaco.app.Controlador;

import com.abaco.app.Servicios.LibrosServicios;
import com.abaco.app.modelos.Libros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Brandon
 */

@RestController
@RequestMapping("/libros")
public class LibrosControlador {
    
    @Autowired
    private LibrosServicios librosServicios;
    
    @GetMapping
    public List<Libros> listar() {
        return librosServicios.listar();
    }
    
    @PostMapping
    public Libros insertar(@RequestBody Libros lib) {
        return librosServicios.Insertar(lib);
    }
    
    @PutMapping
    public Libros actualizar (@RequestBody Libros lib) {
        return librosServicios.Actualizar(lib);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Libros lib) {
        librosServicios.eliminar(lib);
    }
        
}
