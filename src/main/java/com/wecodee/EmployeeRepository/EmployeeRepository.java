package com.wecodee.EmployeeRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wecodee.employeeEntity.EmployeeEntity;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>
{
	public List<EmployeeEntity> findByName(String name);
	
	public List<EmployeeEntity> findBySalaryGreaterThan(double salary);
}
