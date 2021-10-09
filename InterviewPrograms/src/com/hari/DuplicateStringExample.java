package com.hari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStringExample {

	private static void findDuplicates(List<String> listOfStrings) {
		Set<String> set = new HashSet<>();
		List<String> dupList = new ArrayList<>();
		for (String word : listOfStrings) {
			if (!set.add(word)) {
				dupList.add(word);
			}
		}
		System.out.println(dupList);

	}

	private static void findDuplicatesWithFrequency(List<String> listOfStrings) {
		System.out.println(listOfStrings.stream().filter(word -> Collections.frequency(listOfStrings, word) > 1)
				.collect(Collectors.toSet()));
	}

	private static void findDuplicatesWithFrequency2(List<String> listOfStrings) {
		System.out.println(listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(word -> word.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet()));
	}

	private static void findDuplicatesWithJava8(List<String> listOfStrings) {
		Set<String> set = new HashSet<>();
		System.out.println(listOfStrings.stream().filter(word -> !set.add(word)).collect(Collectors.toList()));
	}

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("chn", "hyd", "mum", "mum", "chn", "hyd", "vzg", "bglr");
		findDuplicates(listOfStrings);
		findDuplicatesWithJava8(listOfStrings);
		findDuplicatesWithFrequency(listOfStrings);
		findDuplicatesWithFrequency2(listOfStrings);
	}
}
