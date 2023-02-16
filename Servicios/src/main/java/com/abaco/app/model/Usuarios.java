package com.abaco.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Brandon
 */
@Entity
@Table(name = "usuarios")
public class Usuarios {
    
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 int id;	
	 
	 @Column
	 int documento;
	 
	 @Column
	 String nombre;
	 
	 @Column
	 String correo;
	 
	 @Column
	 String estado;
	 
	 @Column
	 String password;
	 
	 @Column
	 String rol;

    public Usuarios() {
    }

    public Usuarios(int id, int documento, String nombre, String correo, String estado, String password, String rol) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.estado = estado;
        this.password = password;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public int getDocumento() {
        return documento;
    }
    
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
    
    

    
}
