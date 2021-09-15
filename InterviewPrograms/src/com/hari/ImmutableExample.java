package com.hari;

public final class ImmutableExample {
	private final String pancardNumber;

	public ImmutableExample(String pancardNumber) {
		this.pancardNumber = pancardNumber;
	}

	public String getPancardNumber() {
		return pancardNumber;
	}
}
