package com.hari;

public class SecondHighestNumberFromArray {

	private static int getSecondHighestNumber(int[] input) {
		int largestNumber = 0;
		int secondLargestNumber = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > largestNumber) {
				secondLargestNumber = largestNumber;
				largestNumber = input[i];
			} else if (input[i] > secondLargestNumber) {
				secondLargestNumber = input[i];
			}
		}
		return secondLargestNumber;
	}

	public static void main(String[] args) {
		int input[] = { 100, 44, 67, 43, 67, 29, 22, 97, 54, 56, 33, 99, 105, 110 };
		System.out.println(getSecondHighestNumber(input));
	}
}
