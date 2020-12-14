package com.employee.employeeportalservice.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "employees")
@Entity
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 543274472573142106L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "emp_id")
	@ApiModelProperty(notes = "Employee ID",name="empId",required=true,value="Employee ID", hidden = true )
	private int empId;
	@Column(name = "first_name")
    @ApiModelProperty(notes = "First Name",name="firstName",required=true,value="first name")
	private String firstName;
	@Column(name = "last_name")
	@ApiModelProperty(notes = "Last Name",name="lastName",required=true,value="last name")
	private String lastName;
	@Column(name = "dop")
	@ApiModelProperty(notes = "Date of birth",name="dop",required=true,value="date of birth")
	private String dop;
	@Column(name = "department")
	@ApiModelProperty(notes = "Department",name="department",required=true,value="department")
	private String department;
	@Column(name = "gender")
	@ApiModelProperty(notes = "Gender",name="gender",required=true,value="gender")
	private String gender;
}
