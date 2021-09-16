package com.hari.comparator;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getMarks() - obj2.getMarks();
	}
}
