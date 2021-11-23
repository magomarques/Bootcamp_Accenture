package com.eam.Project_Bootcamp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.eam.Project_Bootcamp.model.Employee;
import com.eam.Project_Bootcamp.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		employeeRepository.findAll().forEach(employee -> employees.add(employee));
		return employees;
	}
	
	public Employee getEmployeeById(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public void saveOrUpdateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}
	
}
