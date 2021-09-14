package com.hari;

import java.util.Arrays;

public class AnagaramExample {
	private static boolean isAnagaram(String input1, String input2) {
		boolean isAnagaram = true;
		if (input1.length() != input2.length()) {
			isAnagaram = false;
		} else {
			char[] input1Chars = input1.toLowerCase().toCharArray();
			char[] input2Chars = input2.toLowerCase().toCharArray();
			Arrays.sort(input1Chars);
			Arrays.sort(input2Chars);
			for (int i = 0; i < input1Chars.length; i++) {
				if (input1Chars[i] != input2Chars[i]) {
					isAnagaram = false;
				}
			}
		}
		return isAnagaram;
	}

	public static void main(String[] args) {
		System.out.println(isAnagaram("silent", "liste"));
		System.out.println(isAnagaram("silent", "listen"));
		System.out.println(isAnagaram("Silent", "listen"));
		System.out.println(isAnagaram("silentz", "listeny"));
	}
}
