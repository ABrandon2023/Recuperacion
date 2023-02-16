package com.abaco.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abaco.app.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
