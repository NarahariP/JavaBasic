package com.hari.builder;

public interface Builder {

	void buildFloor();

	void buildTerrace();

	void buildWalls();

	Home getComplexHomeObject();

}
