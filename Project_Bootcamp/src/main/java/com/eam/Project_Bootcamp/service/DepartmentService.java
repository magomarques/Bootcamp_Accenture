package com.eam.Project_Bootcamp.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eam.Project_Bootcamp.model.Department;
//import com.eam.Project_Bootcamp.model.Employee;
import com.eam.Project_Bootcamp.repository.DepartmentRepository;
import com.eam.Project_Bootcamp.repository.EmployeeRepository;


@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public List<Department> getAllDepartment() {
		List<Department> departments = new ArrayList<Department>();
		departmentRepository.findAll().forEach(department -> departments.add(department));
		return departments;
	}
	
	public Department getDepartmentById(int id) {
		return departmentRepository.findById(id).get();
	}
	
	public void saveOrUpdateDepartment(Department department) {
		departmentRepository.save(department);
	}
	
	public void deleteDepartment(int id) {
		departmentRepository.deleteById(id);
	}
	
//	public List<Employee> getAllEmployeeDepartment(int id) {
//		List<Employee> employees = new ArrayList<Employee>();
//		Department department = new Department();
//		employeeRepository.findAll().forEach(employee -> {
//			if (department.getIdDepartment() == id) {
//				employees.add(employee);
//			}
//		});
//		return employees;
//	}
	
}
