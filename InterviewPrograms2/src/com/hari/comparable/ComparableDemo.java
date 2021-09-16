package com.hari.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	private static List<Employee> employeeList = Arrays.asList(new Employee("DeptName45", 345, "empName22"),
			new Employee("DeptName63", 672, "empName76"), new Employee("DeptName22", 342, "empName77"),
			new Employee("DeptName66", 525, "empName45"), new Employee("DeptName22", 525, "empName21"));

	public static void main(String[] args) {
		Collections.sort(employeeList);
		for (Employee employee : employeeList) {
			System.out.println(employee);
		}
	}
}
