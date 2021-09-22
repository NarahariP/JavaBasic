package com.hari;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoOfWordsExample {

	private static void countWords(List<String> input) {
		Map<String, Long> noOfWords = input.stream()
				.collect(Collectors.groupingBy(word -> word.toString(), Collectors.counting()));
		System.out.println(noOfWords);
	}

	public static void main(String[] args) {
		List<String> input = Arrays.asList("chn", "hyd", "mum", "chn", "hyd", "mum", "chn", "chn", "hyd", "bglr",
				"del");
		countWords(input);
	}
}
