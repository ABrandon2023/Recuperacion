package com.abaco.app.Controlador;

import com.abaco.app.Servicios.EmpleadoServicios;
import com.abaco.app.modelos.Empleados;
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
@RequestMapping("/empleados")
public class EmpleadoControlador {
    
    @Autowired
    private EmpleadoServicios empleadosServicios;
    
    @GetMapping
    public List<Empleados> listar() {
        return empleadosServicios.listar();
    }
    
    @PostMapping
    public Empleados insertar(@RequestBody Empleados emp) {
        return empleadosServicios.Insertar(emp);
    }
    
    @PutMapping
    public Empleados actualizar (@RequestBody Empleados emp) {
        return empleadosServicios.Actualizar(emp);
    }
    
    @DeleteMapping
    public void eliminar (@RequestBody Empleados emp) {
        empleadosServicios.eliminar(emp);
    }
    
    
}
