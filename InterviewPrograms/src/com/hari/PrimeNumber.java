package com.hari;

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
	}

	private static void printPrimeUptoNthNumber(int number) {
		for (int i = 0; i < number; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
