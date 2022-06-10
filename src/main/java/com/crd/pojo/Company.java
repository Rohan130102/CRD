package com.crd.pojo;

//Create Company table having columns compId(PK), compName(50 Varchar),
//compAddress(4000 varchar), companyGSTN (100 varchar)
public class Company {

	private int compId;
	private String compName;
	private String compAddress;
	private String companyGSTN;

	
	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompAddress() {
		return compAddress;
	}

	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}

	public String getCompanyGSTN() {
		return companyGSTN;
	}

	public void setCompanyGSTN(String companyGSTN) {
		this.companyGSTN = companyGSTN;
	}

	public Company() {
	}

	public Company(String compName, String compAddress, String companyGSTN) {
		this.compName = compName;
		this.compAddress = compAddress;
		this.companyGSTN = companyGSTN;
	}

}
