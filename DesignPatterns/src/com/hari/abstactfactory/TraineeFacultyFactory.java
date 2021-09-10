package com.hari.abstactfactory;

public class TraineeFacultyFactory extends AbstractFctory {

	@Override
	public Faculty getFaculty(AbstactFactoryEnum typeOfFaculty) {
		if (typeOfFaculty == null) {
			return null;
		}
		if (AbstactFactoryEnum.MATHS.equals(typeOfFaculty)) {
			return new TraineeMathsFaculty();
		}
		if (AbstactFactoryEnum.PHYSICS.equals(typeOfFaculty)) {
			return new TraineePhysicsFaculty();
		}
		return null;
	}

}
