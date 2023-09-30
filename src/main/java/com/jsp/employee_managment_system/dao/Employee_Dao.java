package com.jsp.employee_managment_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.employee_managment_system.dto.Employee;
import com.jsp.employee_managment_system.repository.Employee_Repository;

@Repository
public class Employee_Dao {

	@Autowired
	private Employee_Repository repository;
	
	public Employee save(Employee employee) {
		return repository.save(employee);
	}

	public Optional<Employee> findById(int id) {
		return repository.findById(id);
	}

	public Employee upadte(Employee employee, int id) {
		Optional<Employee> optional = repository.findById(id);
		employee.setId(id);
		return repository.save(employee);
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}
	
	public Employee login(Employee employee){
		return repository.validate(employee.getEmail(),employee.getPwd());
	}
}
