package com.emp.demo.service;

import org.springframework.stereotype.Service;

import com.emp.demo.entity.Employee;

@Service
public interface EmployeeService {
	public String addEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
}
