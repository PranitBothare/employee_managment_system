package com.jsp.employee_managment_system.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.employee_managment_system.dao.Employee_Dao;
import com.jsp.employee_managment_system.dto.Employee;

@RestController
public class Employee_Controller {

	@Autowired
	private Employee_Dao dao;

	// Create and save
	@PostMapping("save/employee")
	public Employee save(@RequestBody Employee employee) {
		return dao.save(employee);
	}

	// find
	@GetMapping("find/employee/{id}")
	public Optional<Employee> find(@PathVariable("id") int id) {
		return dao.findById(id);
	}

	// upadte
	@PutMapping("update/employee/{id}")
	public Employee update(@RequestBody Employee employee, @PathVariable("id") int id) {
		return dao.upadte(employee, id);
	}

	// delete
	@DeleteMapping("delete/employee/{id}")
	public void delete(@PathVariable int id) {
		dao.deleteById(id);

	}

	@GetMapping("login/employee")
	public Employee login(@RequestBody Employee employee) {
		return dao.login(employee);
	}

}
