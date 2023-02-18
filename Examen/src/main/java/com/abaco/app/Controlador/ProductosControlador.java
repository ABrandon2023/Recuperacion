package com.abaco.app.Controlador;

import com.abaco.app.Servicios.ProductosServicio;
import com.abaco.app.modelos.Productos;
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
@RequestMapping("/productos")
public class ProductosControlador {
    
    @Autowired
    private ProductosServicio productosServicios;
    
    @GetMapping
    public List<Productos> listar() {
        return productosServicios.listar();
    }
    
    @PostMapping
    public Productos insertar(@RequestBody Productos prod) {
        return productosServicios.Insertar(prod);
    }
    
    @PutMapping
    public Productos actualizar (@RequestBody Productos prod) {
        return productosServicios.Actualizar(prod);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Productos prod) {
        productosServicios.eliminar(prod);
    }    
    
}
