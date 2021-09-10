package com.hari.singleton;

public class SingleTonEarlyInstantiation {

	private static SingleTonEarlyInstantiation _object = new SingleTonEarlyInstantiation();

	public static SingleTonEarlyInstantiation getInstance() {
		return _object;
	}

	private SingleTonEarlyInstantiation() {
	}

}
