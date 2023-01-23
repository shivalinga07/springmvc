package com.ty.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.dao.EmployeeDao;
import com.ty.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}
	
	public String deleteEmployee(int id) {
		return employeeDao.deleteEmployee(id);
	}
	
	public Employee getEmployee(int id) {
		return employeeDao.getEmployeeById(id);
	}
	
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}
}