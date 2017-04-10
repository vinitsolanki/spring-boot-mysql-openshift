package com.barath.app;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barath.app.Application.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
}