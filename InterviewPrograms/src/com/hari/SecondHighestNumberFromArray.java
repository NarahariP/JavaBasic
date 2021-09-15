package com.hari;

import java.util.Arrays;
import java.util.Collections;

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

		// Java 8
		System.out.println(Arrays.stream(input) // returns IntStream
				.boxed()// converts IntStream into Steam<Integer>
				.sorted(Collections.reverseOrder())// sorting with reverseOrder
				.limit(2)// holding first two elements
				.skip(1)// ignoring 1st one
				.findFirst().get());// finally reading reading remaining element as Optional<Integer>
	}
}
