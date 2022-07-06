package com.wecodee.employeeEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	private int empId;
	private String name;
	private double salary;
//	date
//	age
	
	
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeEntity(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
