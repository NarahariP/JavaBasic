package com.hari;

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

	public static void main(String[] args) {
		System.out.println(isArmstrong(153)); // true
		System.out.println(isArmstrong(123)); // false
		System.out.println(isArmstrong(1634)); // true
	}
}
