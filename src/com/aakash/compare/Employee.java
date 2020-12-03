package com.aakash.compare;

public class Employee //implements Comparable<Employee> 
{
	
	private Integer empId;
	
	private String empName;

	
	public Employee(Integer empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	//@Override
	public int compareTo(Employee o) {
		return empName.compareTo(o.empName);
	}

}
