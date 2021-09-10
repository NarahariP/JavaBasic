package com.hari.builder;

public class Director {

	private Builder builder;

	public Director(Builder builderType) {
		builder = builderType;
	}

	public Home getComplexHomeObjet() {
		return builder.getComplexHomeObject();
	}

	public void manageRequiredHomeConstruction() {
		builder.buildFloor();
		builder.buildWalls();
		builder.buildTerrace();
	}

}
