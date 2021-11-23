package com.eam.Project_Bootcamp.repository;

import org.springframework.data.repository.CrudRepository;

import com.eam.Project_Bootcamp.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
