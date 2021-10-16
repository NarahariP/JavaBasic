package com.hari;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompressStringExample {

	private static String compressString(String input) {
		String[] inputChars = input.split("");
		String last = inputChars[0];
		int counter = 1;
		StringBuilder output = new StringBuilder();
		for (int i = 1; i < inputChars.length; i++) {
			if (last.equals(inputChars[i])) {
				counter++;
			} else {
				output.append(last).append(counter);
				last = inputChars[i];
				counter = 1;
			}
		}
		output.append(last).append(counter);
		if (output.length() < input.length()) {
			return output.toString();
		}
		return input;
	}

	private static String compressStringIn8(String input) {
		return Arrays.asList(input.split("")).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.map(entry -> {
					return entry.getKey() + "" + entry.getValue();
				}).collect(Collectors.joining());

	}

	public static void main(String[] args) {
		String input = "aabbbbaaccaa";
		System.out.println(compressString(input));
		System.out.println(compressStringIn8(input));
	}
}
