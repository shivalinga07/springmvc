package com.ty.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.dto.Employee;
import com.ty.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping("register")
	public ModelAndView getRegisterPage() {
		ModelAndView andView = new ModelAndView();
		andView.setViewName("register.jsp");
		andView.addObject("employee", new Employee());
		return andView;
	}
	
	@RequestMapping("saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
		service.saveEmployee(employee);
		List<Employee> list = service.getAllEmployees();
		ModelAndView andView =new ModelAndView();
		andView.setViewName("view.jsp");
		andView.addObject("emp", list);
		return andView;
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteEmployee(@RequestParam int id) {
		service.deleteEmployee(id);
		ModelAndView andView =new ModelAndView();
		andView.setViewName("view.jsp");
		List<Employee> list = service.getAllEmployees();
		andView.addObject("emp", list);
		return andView;
	}
	
	@RequestMapping("edit")
	public ModelAndView editEmployee(@RequestParam int id) {
		Employee employee= service.getEmployee(id);
		ModelAndView andView =new ModelAndView();
		andView.addObject("employee", employee);
		andView.setViewName("edit.jsp");
		return andView;	
	}
	
	@RequestMapping("updateemployee")
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		service.updateEmployee(employee);
		List<Employee> list = service.getAllEmployees();
		ModelAndView andView =new ModelAndView();
		andView.setViewName("view.jsp");
		andView.addObject("emp", list);
		return andView;
		}
}