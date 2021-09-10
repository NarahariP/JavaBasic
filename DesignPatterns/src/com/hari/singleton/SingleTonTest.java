package com.hari.singleton;

public class SingleTonTest {
	public static void main(String[] args) {
		System.out.println(SingleTonEarlyInstantiation.getInstance());
		System.out.println(SingleTonEarlyInstantiation.getInstance());
	}
}
