package com.hari.abstactfactory;

public class ProfessionalFacultyFactoty extends AbstractFctory {

	@Override
	Faculty getFaculty(AbstactFactoryEnum typeOfFaculty) {
		if (typeOfFaculty == null) {
			return null;
		}
		if (AbstactFactoryEnum.MATHS.equals(typeOfFaculty)) {
			return new MathsFaculty();
		}
		if (AbstactFactoryEnum.PHYSICS.equals(typeOfFaculty)) {
			return new PhysicsFaculty();
		}
		return null;
	}

}
