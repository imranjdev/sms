package com.app.sms.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE")
@PrimaryKeyJoinColumn(name="USER_ID")
public class Employee extends User{
	@Column(name="EMPLOYEE_ID")
	private int employeeId;
	@Column(name="EMPLOYEE_TYPE")
	private String employeeType;
}
