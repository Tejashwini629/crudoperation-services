package com.wecodee.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecodee.EmployeeRepository.EmployeeRepository;
import com.wecodee.employeeEntity.EmployeeEntity;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeerepo;
	
	public EmployeeEntity createEmployee(EmployeeEntity emp)
	{
		return employeerepo.save(emp);
		
	}

	public List<EmployeeEntity> getEmployee() {
		return employeerepo.findAll();
		
	}
// second commit
	public List<EmployeeEntity> getemployeebyName(String name) {
		return employeerepo.findByName(name);
		
	}
	
	public List<EmployeeEntity> getEmployeeByGreaterSalary(double salary)
	{
		return employeerepo.findBySalaryGreaterThan(salary);
	}
}
