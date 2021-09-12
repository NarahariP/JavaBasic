package com.hari;

public class FibonacciExample {

	public static void main(String[] args) {
		printFibonacciNumbers(10);
	}

	private static void printFibonacciNumbers(int number) {
		int a = 0, b = 0, c = 1;
		for (int i = 0; i < number; i++) {
			a = b;
			b = c;
			c = a + b;
			System.out.println(a);
		}
	}

}
