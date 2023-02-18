package com.abaco.app.Servicios;

import com.abaco.app.modelos.Productos;
import com.abaco.app.repositorio.ProductosRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brandon
 */

@Service
public class ProductosServicio {
    @Autowired
    private ProductosRepositorio productosRepositorio;
    
    public Productos Insertar(Productos prod) {
        return productosRepositorio.save(prod);
    }
    
    public Productos Actualizar(Productos prod) {
        return productosRepositorio.save(prod);
    }
    
    public List<Productos> listar() {
        return productosRepositorio.findAll();
    }
    
    public void eliminar(Productos prod) {
        productosRepositorio.delete(prod);
    }       
}
