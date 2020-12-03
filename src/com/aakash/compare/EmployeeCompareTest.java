package com.aakash.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeCompareTest {
	
	public static void main(String args[]) {
		Employee emp1 = new Employee(1, "MNP");
		Employee emp2 = new Employee(3, "XYZ");
		Employee emp3 = new Employee(2, "Aakash");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);empList.add(emp3);
		//Collections.sort(empList);
		Collections.sort(empList, new EmployeeComparator());
		
		for(Employee emp :empList) {
			System.out.println(emp.getEmpName());
		}
	}

}
