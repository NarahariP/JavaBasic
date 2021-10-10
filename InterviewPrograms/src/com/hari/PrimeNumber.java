package com.hari;

import java.util.stream.IntStream;

public class PrimeNumber {

	private static boolean isPrime(int number) {
		boolean isPrime = true;
		if (number == 1 || number == 0) {
			isPrime = false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(5));
		printPrimeUptoNthNumber(100);
		System.out.println();
		printPrimeNumbersUpto1(100);
		System.out.println();
		printPrimeNumbersUpto2(100);
		System.out.println();
		printPrimeNumbersUpto3(100);
		System.out.println();
		printPrimeNumbersUpto4(100);
	}

	private static boolean primeCheckWithAnyMatch(int val) {
		return !IntStream.rangeClosed(2, val / 2).anyMatch(i -> val % i == 0);
	}

	private static boolean primeCheckWithNoneMatch(int val) {
		return IntStream.rangeClosed(2, val / 2).noneMatch(k -> val % k == 0);
	}

	private static void printPrimeNumbersUpto1(int val) {
		IntStream.rangeClosed(2, val).filter(i -> !IntStream.rangeClosed(2, i / 2).anyMatch(k -> i % k == 0))
				.forEach(v -> System.out.print(v + " "));
	}

	private static void printPrimeNumbersUpto2(int val) {
		IntStream.rangeClosed(2, val).filter(i -> primeCheckWithAnyMatch(i)).forEach(v -> System.out.print(v + " "));
		/* with method ref */
		System.out.println();
		IntStream.rangeClosed(2, val).filter(PrimeNumber::primeCheckWithAnyMatch)
				.forEach(v -> System.out.print(v + " "));
	}

	private static void printPrimeNumbersUpto3(int val) {
		IntStream.rangeClosed(2, val).filter(i -> !IntStream.rangeClosed(2, i / 2).anyMatch(k -> i % k == 0))
				.forEach(v -> System.out.print(v + " "));
	}

	private static void printPrimeNumbersUpto4(int val) {
		IntStream.rangeClosed(2, val).filter(i -> primeCheckWithNoneMatch(i)).forEach(v -> System.out.print(v + " "));
		/* with method ref */
		System.out.println();
		IntStream.rangeClosed(2, val).filter(PrimeNumber::primeCheckWithNoneMatch)
				.forEach(v -> System.out.print(v + " "));
	}

	private static void printPrimeUptoNthNumber(int number) {
		for (int i = 0; i < number; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
