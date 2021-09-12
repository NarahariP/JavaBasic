package com.hari;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharactersFromString {

	private static void findDuplicateCharacters(String input) {
		char[] charArr = input.toLowerCase().toCharArray();
		Set<Character> charSet = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[i] == charArr[j] && !charSet.contains(charArr[j])) {
					System.out.println(charArr[j]);
					charSet.add(charArr[j]);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String input = "DuplicateCharactersFromString";
		findDuplicateCharacters(input);
	}
}
