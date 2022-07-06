package com.wecodee.EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wecodee.EmployeeService.EmployeeService;
import com.wecodee.employeeEntity.EmployeeEntity;

@RestController
@RequestMapping("/crudoperation")
public class EmployeeController
{
	@Autowired
	private EmployeeService empserve;
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody EmployeeEntity emp)
	{
		System.out.println("Inside crud operation");
		empserve.createEmployee(emp);
		return "employee added";
	}
	
	@GetMapping("/getEmployee")
	public List<EmployeeEntity> getAllEmployee()
	{
		return empserve.getEmployee();
		 
	}
	
	@GetMapping("/getEmployeeByName/{name}")
	public List<EmployeeEntity> getEmployeebyname(@PathVariable ("name") String name )
	{
		return empserve.getemployeebyName(name);
	}
	
	@GetMapping("/getEmployeeWithGreaterSalary/{salary}")
	public List<EmployeeEntity> getEmployeebysalary(@PathVariable ("salary") double salary )
	{
		return empserve.getEmployeeByGreaterSalary(salary);
	}

}
