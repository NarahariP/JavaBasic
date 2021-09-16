package com.har.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	private static List<Student> studentList = Arrays.asList(new Student("Raju", "0173749", 623),
			new Student("Mahesh", "6296202", 789), new Student("Venky", "2739376", 839),
			new Student("Raju", "0296303", 990), new Student("Venky", "1037393", 576),
			new Student("Basha", "0036363", 860));

	public static void main(String[] args) {
		Collections.sort(studentList, new NameComparator());
		studentList.forEach(student -> System.out.println(student));
		System.out.println("*******");
		Collections.sort(studentList, new MarksComparator());
		studentList.forEach(student -> System.out.println(student));
		System.out.println("*******");
		Collections.sort(studentList, new RollNumberComparator());
		studentList.forEach(student -> System.out.println(student));

		// Java8
		System.out.println("*******");
		studentList.stream().sorted(new RollNumberComparator()).forEach(student -> System.out.println(student));
		System.out.println("*******");
		studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getRollNumber))
				.forEach(student -> System.out.println(student));
	}
}
