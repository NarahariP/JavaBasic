package com.hari;

import java.util.Arrays;
import java.util.List;

/**
 * count the number of letters from List<String>, each String denotes one line
 * and exclude white spaces
 */
public class NoOfLettersExample {

	static List<String> listOfLines = Arrays.asList(
			"Platform as a service is a complete development and deployment environment in the cloud",
			"with resources that enable you to deliver everything from simple cloud based apps to sophisticated",
			"cloud enabled enterprise applications",
			"You purchase the resources you need from a cloud service provider on a pay as you go basis and access them over a secure Internet connection");

	public static void main(String[] args) {
		System.out.println(noOfChar(listOfLines));
		System.out.println(noOfChar2(listOfLines));
	}

	private static int noOfChar(List<String> listOfLiness) {
		int count = 0;
		for (String line : listOfLiness) {
			for (String letter : line.split("")) {
				if (!letter.equals(" ")) {
					count++;
				}
			}
		}
		return count;
	}

	private static int noOfChar2(List<String> listOfLiness) {
		int count = 0;
		for (String line : listOfLiness) {
			count += line.replace(" ", "").length();
		}
		return count;
	}
}
