package com.hari;

import java.util.stream.IntStream;

public class ArmstrongNumberExample {

	private static boolean isArmstrong(int number) {
		boolean isArmstrong = false;
		int temp = number;
		int sum = 0;
		int digits = String.valueOf(number).split("").length;
		while (number > 0) {
			int reminder = number % 10;
			number = number / 10;
			int value = 1;
			for (int i = 0; i < digits; i++) {
				value = value * reminder;
			}
			sum = sum + value;
		}
		if (sum == temp) {
			isArmstrong = true;
		}
		return isArmstrong;
	}

	// Java 8
	public static boolean isArmstrongInJava8(int number) {
		return IntStream.builder().add(number).build().allMatch(n -> {
			int c = 0, temp = n;
			while (n > 0) {
				c += Math.pow(n % 10, Integer.toString(temp).length());
				n = n / 10;
			}
			if (c == temp)
				return true;
			else
				return false;
		});
	}

	public static void main(String[] args) {
		System.out.println(isArmstrong(153)); // true
		System.out.println(isArmstrong(123)); // false
		System.out.println(isArmstrong(1634)); // true

		System.out.println(isArmstrongInJava8(153)); // true
	}
}
