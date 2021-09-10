package com.hari.builder;

public class BuilderPatternTest {
	public static void main(String[] args) {
		EarthQuakeResistanceBuilder earthQuakeResistanceBuilder = new EarthQuakeResistanceBuilder();

		Director director = new Director(earthQuakeResistanceBuilder);
		director.manageRequiredHomeConstruction();
		Home earthQuakeResistanceHome = director.getComplexHomeObjet();
		System.out.println(earthQuakeResistanceHome.floor);
	}
}
