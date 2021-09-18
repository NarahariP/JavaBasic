package com.hari;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortingExample {

	public static void main(String[] args) {
		int[] input = { 34, 44, 63, 2, 4, 7, 25, 45, 6, 55, 7 };
		sortingArray(input);
		// Java 8
		Arrays.stream(input).sorted().forEach(System.out::println);
		Arrays.stream(input).boxed().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}

	private static void sortingArray(int[] input) {
		int[] tempArr = input;
		int temp;
		for (int i = 0; i < tempArr.length; i++) {
			for (int j = 0; j < tempArr.length - 1; j++) {
				if (tempArr[j] > tempArr[j + 1]) {
					temp = tempArr[j];
					tempArr[j] = tempArr[j + 1];
					tempArr[j + 1] = temp;
				}
			}
		}
		System.out.println("After Custom Sort");
		for (int i : tempArr) {
			System.out.println(i);
		}
		Arrays.sort(input);
		System.out.println("After Sort with Arrays.sort()");
		for (int i : input) {
			System.out.println(i);
		}
	}
}
