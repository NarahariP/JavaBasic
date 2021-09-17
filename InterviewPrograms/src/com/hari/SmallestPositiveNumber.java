package com.hari;

import java.util.Arrays;

/**
 * given an array A of N integers, returns the smallest positive integer
 * (greater than 0) that does not occur in A.
 */
public class SmallestPositiveNumber {

	public static void main(String[] args) {
		int[] input = { 3, 1, 2, 7, 4, 6, 5 };
		System.out.println(smallestPositiveNumber(input));
	}

	private static int smallestPositiveNumber(int[] input) {
		int smallestNumber = 1;
		Arrays.sort(input);
		for (int i : input) {
			if (smallestNumber >= i) {
				smallestNumber++;
			}
		}
		return smallestNumber;
	}
}
