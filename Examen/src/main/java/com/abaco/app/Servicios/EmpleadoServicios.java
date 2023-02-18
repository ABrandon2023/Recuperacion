package com.abaco.app.Servicios;

import com.abaco.app.modelos.Empleados;
import com.abaco.app.repositorio.EmpleadoRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Brandon
 */

@Service
public class EmpleadoServicios {
    
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;
    
    public Empleados Insertar(Empleados emp) {
        return empleadoRepositorio.save(emp);
    }
    
    public Empleados Actualizar(Empleados emp) {
        return empleadoRepositorio.save(emp);
    }
    
    public List<Empleados> listar() {
        return empleadoRepositorio.findAll();
    }
    
    public void eliminar(Empleados emp) {
        empleadoRepositorio.delete(emp);
    }
    
}
