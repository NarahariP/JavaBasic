package com.hari.patterns;

/**
 * 1
 * 23
 * 456
 * 78910
 */
public class Pattern1 {

	private static void drawPattern(int noOfrows) {
		int value = 1;
		for (int i = 1; i <= noOfrows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + "\t");
				value++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int noOfrows = 4;
		drawPattern(noOfrows);
	}

}
