package com.devsuperior.aula_lazy.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.aula_lazy.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	//consulta que busca todos os employees do banco JUNTO com o seus respectivos departamentos
	@Query("SELECT obj FROM Employee obj JOIN FETCH obj.department") //Método Join Fetch / Linguagem JPQL (parecida com SQL)
	List<Employee> findEmployeesWithDepartments();
}
