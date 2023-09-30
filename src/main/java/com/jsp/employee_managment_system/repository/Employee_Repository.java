package com.jsp.employee_managment_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.employee_managment_system.dto.Employee;

public interface Employee_Repository extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee e WHERE e.email = :email AND e.pwd = :pwd")
	Employee validate(@Param ("email") String email, @Param ("pwd") String pwd);
	
}
