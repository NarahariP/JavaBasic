package com.hari;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

	private static boolean isAnagaram2(String input1, String input2) {
		List<String> listWord1 = Arrays.asList(input1.toLowerCase().split(""));
		List<String> listWord2 = Arrays.asList(input2.toLowerCase().split(""));
		Collections.sort(listWord1);
		Collections.sort(listWord2);
		input1 = String.join("", listWord1);
		input2 = String.join("", listWord2);
		return input1.equals(input2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagaram("silent", "liste"));
		System.out.println(isAnagaram("silent", "listen"));
		System.out.println(isAnagaram("Silent", "listen"));
		System.out.println(isAnagaram("silentz", "listeny"));
		System.out.println("==========================");
		System.out.println(isAnagaram2("silent", "liste"));
		System.out.println(isAnagaram2("silent", "listen"));
		System.out.println(isAnagaram2("Silent", "listen"));
		System.out.println(isAnagaram2("silentz", "listeny"));
	}
}
