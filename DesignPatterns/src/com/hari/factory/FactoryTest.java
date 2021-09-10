package com.hari.factory;

public class FactoryTest {

	public static void main(String[] args) { // We can use String instead of FacultyEnum
		FacultyFactory facultyFactory = new FacultyFactory();
		Faculty faculty = facultyFactory.getFaculty(FacultyEnum.PHYSICS);
		System.out.println(faculty);
		faculty.print();
		faculty = facultyFactory.getFaculty(FacultyEnum.CHEMISTRY);
		System.out.println(faculty);
		faculty.print();
		faculty = facultyFactory.getFaculty(FacultyEnum.MATHS);
		System.out.println(faculty);
		faculty.print();
		faculty = facultyFactory.getFaculty(null);
		System.out.println(faculty);
		faculty.print(); // java.lang.NullPointerException
	}
}
