package com.ty.dao;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.dto.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	EntityManager entityManager;
	
	public Employee saveEmployee(Employee employee) {
		LocalDate dob = LocalDate.parse(employee.getDob());
		LocalDate currentdate=LocalDate.now();
		int age =Period.between(dob, currentdate).getYears();
		System.out.println(age);
		employee.setAge(age);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		 entityManager.persist(employee);
		 entityTransaction.commit();
		 return employee;
	}
	
	public String deleteEmployee(int id) {
		Employee s=entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if(s!=null) {
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			return "deleted successfully";
		}	 	
	return "Could not delete";	
	}
	
	public Employee updateEmployee(Employee student) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(student);
		 entityTransaction.commit();	
	return student;	
	}	
	
	public Employee getEmployeeById(int id) {
		Employee s = entityManager.find(Employee.class, id);
		if(s!=null) {
			return s;
		}
		return null;
	}
	
	public List<Employee> getAllEmployees(){
		Query query = entityManager.createQuery("select e from Employee e");
		List<Employee> students = query.getResultList();
		return students;
	}
}