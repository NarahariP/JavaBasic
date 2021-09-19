package com.hari.patterns;

/**
 * 1 2 3 4 
 * 2 3 4 1 
 * 3 4 1 2 
 * 4 1 2 3
 */
public class Pattern2 {

	private static void drawPattern(int noOfRows) {
		for (int i = 1; i < noOfRows + 1; i++) {
			for (int j = i; j < noOfRows + 1; j++) {
				System.out.print(j + " ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int noOfRows = 4;
		drawPattern(noOfRows);
	}
}
