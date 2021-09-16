package com.hari.comparator;

import java.util.Comparator;

public class RollNumberComparator implements Comparator<Student> {

	@Override
	public int compare(Student obj1, Student obj2) {
		return obj1.getRollNumber().compareTo(obj2.getRollNumber());
	}

}
