package com.eam.Project_Bootcamp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
@Table
public class Scheduling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column
	private int idScheduling;
	
	@NotNull
	@Column
	private Date day;
	
	@NotNull
	@Column
	private Date createdAt;
	
	@ManyToOne
	@JsonProperty(access = Access.READ_ONLY)
	@JoinColumn(name="idEmployee", nullable=false)
	private Employee employee;
	
	@ManyToOne
	@JsonProperty(access = Access.READ_ONLY)
	@JoinColumn(name="idRoom", nullable=false)
	private Room room;
	
	public int getIdScheduling() {
		return idScheduling;
	}

	public void setIdScheduling(int idScheduling) {
		this.idScheduling = idScheduling;
	}

	public Date getDay() {
		return day;
	}

	public void setDay(Date day) {
		this.day = day;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
