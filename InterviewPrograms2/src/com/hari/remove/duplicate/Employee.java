package com.hari.remove.duplicate;

public class Employee {

	private int id;
	private String marks;
	private String name;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;
		return (id == emp.id && name.equalsIgnoreCase(emp.getName()) && marks.equalsIgnoreCase(emp.getMarks()));
	}

	public int getId() {
		return id;
	}

	public String getMarks() {
		return marks;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		int hashCode = 31;
		if (name != null)
			hashCode += name.hashCode();
		if (marks != null)
			hashCode += marks.hashCode();
		if (id != 0) {
			hashCode += id;
		}
		return hashCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
