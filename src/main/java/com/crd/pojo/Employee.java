package com.crd.pojo;

//Create Employee table having columns empId (PK), empName(50 Varchar), 
//empSalary(100 varchar), empAddress(4000 varchar), companyId(FK), 
//empCode(4 varChar)
public class Employee {

	private int empId;
	private String empName;
	private double empSalary;
	private String empAddress;
	private Company company;
	private int empCode;

	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public Employee() {
	}

	public Employee(String empName, double empSalary, String empAddress, Company company, int empCode) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.company = company;
		this.empCode = empCode;
	}

}
