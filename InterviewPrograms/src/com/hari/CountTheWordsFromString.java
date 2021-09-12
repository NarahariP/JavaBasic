package com.hari;

import java.util.HashMap;
import java.util.Map;

public class CountTheWordsFromString {

	public static void main(String[] args) {
		String input = "This is created is by ok this Hari test hari";
		String[] inputArr = input.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < inputArr.length; i++) {
			if (map.containsKey(inputArr[i].toLowerCase())) {
				map.put(inputArr[i], map.get(inputArr[i]) + 1);
			} else {
				map.put(inputArr[i].toLowerCase(), 1);
			}
		}
		System.out.println(map);
	}
}
