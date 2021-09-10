package com.hari.singleton;

public class SingleTonLazyInstantiation {
	private static SingleTonLazyInstantiation _object;

	public static SingleTonLazyInstantiation getInstance() {// Add 'synchronized' in case of multi threading programming
		if (_object == null) {
			_object = new SingleTonLazyInstantiation();
		}
		return _object;
	}

	private SingleTonLazyInstantiation() {

	}
}
