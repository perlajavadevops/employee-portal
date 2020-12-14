package com.employee.employeeportalservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.employeeportalservice.bean.Employee;
import com.employee.employeeportalservice.service.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "EmployeeController", description = "REST Apis related to Employee Portal!!!!")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@ApiOperation(value = "Get list of employees", response = Iterable.class, tags = "Employee Portal APIS", hidden = false)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Suceess|OK"),
			@ApiResponse(code = 401, message = "not authorized!"), @ApiResponse(code = 403, message = "forbidden!!!"),
			@ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@ApiOperation(value = "To Save Employee", response = Employee.class, tags = "Employee Portal APIS", hidden = false)
	@PostMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee saveEmployee(@Valid @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

}
