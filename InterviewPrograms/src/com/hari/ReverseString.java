package com.hari;

public class ReverseString {

	public static void main(String[] args) {
		String input = "String Reverse";
		usingStringBuilder(input);
		usingToCharArray(input);
		usingCharAt(input);
		usingSplit(input);
	}

	private static void usingCharAt(String string) {
		System.out.println();
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		System.out.println(reverse);
	}

	private static void usingSplit(String string) {
		String[] input = string.split("");
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i]);
		}
	}

	private static void usingStringBuilder(String string) {
		StringBuilder builder = new StringBuilder(string);
		System.out.println(builder.reverse());
	}

	private static void usingToCharArray(String string) {
		char[] stringChars = string.toCharArray();
		for (int i = stringChars.length - 1; i >= 0; i--) {
			System.out.print(stringChars[i]);
		}
	}
}
