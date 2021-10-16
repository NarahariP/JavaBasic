package com.hari;

import java.util.function.Function;

public class ValidPairOfBracesExample {

	static int count = 0;
	static Function<Character, String> function = ch -> {
		if (ch == '{') {
			count++;
		} else if (count > 0 && ch == '}') {
			count--;
			return "Y";
		}
		return "N";
	};

	public static void main(String[] args) {
		String input1 = "main{method() {System{out{.println(\"okay\")}print() {testing}}";
		String input2 = "main{method() {System{}out{.println(\"okay\")}print() {testing}}";
		System.out.println(noOfValidPairs(input1));
		System.out.println(noOfValidPairs(input2));
		System.out.println(noOfValidPairsInJava8(input1));
		System.out.println(noOfValidPairsInJava8(input2));
	}

	private static int noOfValidPairs(String input) {
		char[] inputChars = input.toCharArray();
		int count = 0;
		int temp = 0;
		for (int i = 0; i < inputChars.length; i++) {
			if (inputChars[i] == '{') {
				temp++;
			} else if (temp > 0 && inputChars[i] == '}') {
				count++;
				temp--;
			}
		}
		return count;
	}

	private static long noOfValidPairsInJava8(String input) {
		long count = input.chars().mapToObj(c -> {
			return (char) c;
		}).map(ch -> function.apply(ch)).filter(val -> "Y".equals(val)).count();
		return count;
	}

}
