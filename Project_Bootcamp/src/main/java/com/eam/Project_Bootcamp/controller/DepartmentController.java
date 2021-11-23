package com.eam.Project_Bootcamp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eam.Project_Bootcamp.model.Department;
import com.eam.Project_Bootcamp.service.DepartmentService;


@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;

	@GetMapping("/department")
	private List<Department> getAllDepartment() {
		return departmentService.getAllDepartment();
	}
	
	@GetMapping("/department/{id}")
	private Department getDepartment(@PathVariable("id") int id) {
		return departmentService.getDepartmentById(id);
	}
	
	@PostMapping("/department")
	private int saveDepartment(@RequestBody Department department) {
		departmentService.saveOrUpdateDepartment(department);
		return department.getIdDepartment();
	}
	
	@DeleteMapping("/department/{id}")
	private void deleteDepartment(@PathVariable("id") int id) {
		departmentService.deleteDepartment(id);
	}
	
}
