package com.eam.Project_Bootcamp.model;

import java.util.Date;
import java.util.List;
//import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Table
public class Employee {
	

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column
	private int idEmployee;
	
	@NotNull
	@Column
	private String name;
	
	@NotNull
	@Column
	private Date createdAt;
	
	@NotNull
	@Column
	private String email;
	
	@ManyToOne
	@JsonProperty(access = Access.READ_ONLY)
	@JoinColumn(name="idDepartment", nullable=false)
	private Department department;
	
	@OneToMany(mappedBy="employee")
	private List<Scheduling> scheduling;

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
