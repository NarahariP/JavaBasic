package com.hari;

public class PalindromeExample {

	private static boolean isPalindrome(String string) {
		boolean isPalindrome = false;
		String reverse = "";
		String[] stringArr = string.trim().split("");
		for (int i = stringArr.length - 1; i >= 0; i--) {
			reverse = reverse + stringArr[i];
		}
		if (reverse.equalsIgnoreCase(string)) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("Eye")); // true
		System.out.println(isPalindrome("test")); // false
	}
}
