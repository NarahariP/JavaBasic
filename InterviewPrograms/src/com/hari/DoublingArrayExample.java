package com.hari;

import java.util.Arrays;

/**
 * Repeatedly search an element by doubling it after every successful search and
 * return maximum integer value
 */
public class DoublingArrayExample {

	private static int findMaxValue(int[] arr, int num) {
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		while (num < max) {
			if (Arrays.binarySearch(arr, num) > -1)
				num *= 2;
			else
				return num;
		}
		return num;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 11, 12, 8 };
		int num = 2;
		System.out.println(findMaxValue(arr, num));
	}
}
