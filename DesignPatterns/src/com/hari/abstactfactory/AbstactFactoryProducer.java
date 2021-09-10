package com.hari.abstactfactory;

public class AbstactFactoryProducer {
	public static AbstractFctory getProfession(boolean isTrainee) {
		if (isTrainee) {
			return new TraineeFacultyFactory();
		} else {
			return new ProfessionalFacultyFactoty();
		}
	}
}
