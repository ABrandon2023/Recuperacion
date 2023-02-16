package com.abaco.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.abaco.app.model.Employee;

@Repository
//@Service
//@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
//	Optional<Employee> findByName(String name);

//	List<Employee> findAll();
}
