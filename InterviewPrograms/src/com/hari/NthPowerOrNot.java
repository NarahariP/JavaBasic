package com.hari;

public class NthPowerOrNot {

	/*
	 * if value1 = 2, vlaue2=6 then 2^2 = 4, 2^3 = 8 => false; 
	 * if value1 = 2, value2=8 then  2^3 = 8 => true
	 */
	private static void isNthPowerOrNot(int value1, int value2) {
		boolean isNthPower = false;
		int temp = 1;
		while (temp < value2) {
			temp = value1 * temp;
			if (temp == value2) {
				isNthPower = true;
			} else if (temp > value2) {
				break;
			} else {
				continue;
			}
		}
		System.out.println(isNthPower);
	}

	public static void main(String[] args) {
		isNthPowerOrNot(5, 125);
		isNthPowerOrNot(2, 8);
	}
}
