package com.hari.prototype;

public class PrototypeTest {
	public static void main(String[] args) {
		Student student = new Student(1, "Test");
		System.out.println(student.hashCode() + ":" + student);
		Student student2 = student.getClone();
		System.out.println(student2.hashCode() + ":" + student2);
	}
}
