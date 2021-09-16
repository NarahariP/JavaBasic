package com.hari.multipleinheritance.interfacee;

public class ClassC implements ClassA, ClassB {

	@Override
	public void displayA() {
		System.out.println("Executing display from ClassA");

	}

	@Override
	public void displayB() {
		System.out.println("Executing display from ClassB");
	}

	@Override
	public void print() {
		System.out.println("From ClassC");
	}

}
