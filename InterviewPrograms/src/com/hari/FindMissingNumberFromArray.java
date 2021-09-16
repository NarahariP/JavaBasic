package com.hari;

import java.util.Arrays;

public class FindMissingNumberFromArray {

	private static int getMissingNumber(int[] arr, int totalNumbers) {
		int totalSum = totalNumbers * (totalNumbers + 1) / 2;
		int actualSum = 0;
		for (int i : arr) {
			actualSum += i;
		}
		return totalSum - actualSum;
	}

	private static int getMissingNumberIn8(int[] arr, int totalNumbers) {
		return totalNumbers * (totalNumbers + 1) / 2 - Arrays.stream(arr).sum();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 2, 1, 6 };
		System.out.println(getMissingNumber(arr, arr.length + 1));
		// Java 8
		System.out.println(getMissingNumberIn8(arr, arr.length + 1));
	}
}
