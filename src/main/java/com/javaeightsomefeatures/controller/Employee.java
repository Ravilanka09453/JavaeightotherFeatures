package com.javaeightsomefeatures.controller;

public class Employee {
	
	private String empId;
	private String empName;
	private String empStream;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpStream() {
		return empStream;
	}
	public Employee(String empId, String empStream) {
		super();
		this.empId = empId;
		this.empStream = empStream;
	}
	public Employee() {
		super();
	}
	public Employee(String empId, String empName, String empStream) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empStream = empStream;
	}
	public void setEmpStream(String empStream) {
		this.empStream = empStream;
	}

}
