package com.employee.employeeportalservice.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeeportalservice.bean.Employee;
import com.employee.employeeportalservice.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {

		List<Employee> list = employeeRepository.findAll();
		list.sort((Employee emp1, Employee emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName()));
	
		return list;
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
