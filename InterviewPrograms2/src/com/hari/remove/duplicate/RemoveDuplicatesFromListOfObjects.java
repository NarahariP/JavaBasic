package com.hari.remove.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * In order to remove duplicates of custom object from array/collection we need
 * to override equals and hashcode
 */
public class RemoveDuplicatesFromListOfObjects {
	static List<Employee> listOfEmp = Arrays.asList(new Employee(11, "name", "43"), new Employee(21, "name", "43"),
			new Employee(12, "name12", "43"), new Employee(51, "name51", "51"), new Employee(12, "name12", "43"),
			new Employee(11, "name", "43"), new Employee(51, "name51", "51"), new Employee(11, "name", "43"));

	public static void main(String[] args) {
		Set<Employee> setOfEmp = new HashSet<>();
		for (Employee emp : listOfEmp) {
			System.out.println(emp);
			setOfEmp.add(emp);
		}
		System.out.println("===================");
		for (Employee emp : setOfEmp) {
			System.out.println(emp);
		}
		// Java 8
		System.out.println("======================");
		listOfEmp.stream().collect(Collectors.toSet()).forEach(System.out::println);

	}

}
