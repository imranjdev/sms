package com.app.sms.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="STUDENT")
@PrimaryKeyJoinColumn(name="USER_ID")
public class Student extends User{
	@Column(name="ADMISSION_NUMBER")
	private int admissionNo;
	@Column(name="ADMISSION_DATE")
	private Date admissionDate;
	
}
