package com.hari.comparable;

public class Employee implements Comparable<Employee> {
	private String deptName;
	private int id;
	private String name;

	public Employee() {
		super();
	}

	public Employee(String deptName, int id, String name) {
		super();
		this.deptName = deptName;
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee employee) {
		int value = 0;
		value = deptName.compareTo(employee.getDeptName());
		if (value == 0) {
			value = name.compareTo(employee.getName());
		}
		return value;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", id=" + id + ", name=" + name + "]";
	}

}
