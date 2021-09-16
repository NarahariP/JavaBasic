package com.hari;

public class ValidPairOfBracesExample {

	public static void main(String[] args) {
		String input1 = "main{method() {System.out.println(\"okay\")}print() {testing}}";
		String input2 = "main{method() {System{}out{.println(\"okay\")}print() {testing}}";
		System.out.println(noOfValidPairs(input1));
		System.out.println(noOfValidPairs(input2));

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
}
