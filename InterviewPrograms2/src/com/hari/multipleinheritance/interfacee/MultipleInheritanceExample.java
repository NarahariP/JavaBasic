package com.hari.multipleinheritance.interfacee;

/**
 * With help of interface java supports Multiple Inheritance, by having common
 * method in multiple interfaces or having different methods
 */
public class MultipleInheritanceExample {

	public static void main(String[] args) {
		ClassC classC = new ClassC();
		classC.print();

		classC.displayA();
		classC.displayB();
	}

}
