package com.har.comparator;

public class Student {
	private int marks;
	private String name;
	private String rollNumber;

	public Student() {
		super();
	}

	public Student(String name, String rollNumber, int marks) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "Strudent [name=" + name + ", rollNumber=" + rollNumber + ", marks=" + marks + "]";
	}

}
