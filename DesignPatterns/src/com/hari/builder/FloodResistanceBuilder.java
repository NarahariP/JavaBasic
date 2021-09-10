package com.hari.builder;

public class FloodResistanceBuilder implements Builder {

	private Home _floodResistanceHome = new Home();

	@Override
	public void buildFloor() {
		_floodResistanceHome.floor = "Flood Resistance Floor";
	}

	@Override
	public void buildTerrace() {
		_floodResistanceHome.terrace = "Flood Resistance Terrace";
	}

	@Override
	public void buildWalls() {
		_floodResistanceHome.walls = "Flood Resistance Walls";
	}

	@Override
	public Home getComplexHomeObject() {
		return _floodResistanceHome;
	}

}
