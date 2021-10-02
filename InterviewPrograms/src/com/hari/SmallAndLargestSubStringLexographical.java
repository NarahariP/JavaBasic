package com.hari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallAndLargestSubStringLexographical {

	private static String getSmallestAndLargest(String s, int k) {
		String smallest = "a";
		String largest = "";
		for (int i = 0; i <= s.length() - k; i++) {
			String subString = s.substring(i, i + k);
			if (i == 0) {
				smallest = subString;
			}
			if (subString.compareTo(largest) > 0) {
				largest = subString;
			} else if (subString.compareTo(smallest) < 0)
				smallest = subString;
		}
		return smallest + "\n" + largest;
	}

	private static String getSmallestAndLargest2(String s, int k) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length() - 2; i++) {
			list.add(s.substring(i, (k + i)));
		}
		Collections.sort(list);
		return list.get(0) + "\n" + list.get(list.size() - 1);
	}

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		System.out.println(getSmallestAndLargest(s, k));
		System.out.println(getSmallestAndLargest2(s, k));
	}
}
