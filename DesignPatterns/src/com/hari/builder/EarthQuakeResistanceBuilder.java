package com.hari.builder;

public class EarthQuakeResistanceBuilder implements Builder {

	private Home _earthQuakeResistanceHome = new Home();

	@Override
	public void buildFloor() {
		_earthQuakeResistanceHome.floor = "Wooden Floor";
	}

	@Override
	public void buildTerrace() {
		_earthQuakeResistanceHome.walls = "Wooden Walls";
	}

	@Override
	public void buildWalls() {
		_earthQuakeResistanceHome.terrace = "Wooden Terrace";
	}

	@Override
	public Home getComplexHomeObject() {
		return _earthQuakeResistanceHome;
	}

}
