package com.devsuperior.aula_lazy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aula_lazy.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
