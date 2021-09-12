package com.hari;

public class SwappingExample {

	public static void main(String[] args) {
		withOutThirdVariable();
		usingThirdVariable();
	}

	private static void usingThirdVariable() {
		int a = 10, b = 20;
		System.out.println("Before swapp=> " + a + " : " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapp=> " + a + " : " + b);
	}

	private static void withOutThirdVariable() {
		int a = 10, b = 20;
		System.out.println("Before swapp=> " + a + " : " + b);
		a = a + b; // 10 + 20 = 30
		b = a - b; // 30 - 20 = 10
		a = a - b; // 30 - 10 = 20
		System.out.println("After swapp=> " + a + " : " + b);
	}
}
