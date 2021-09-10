package com.hari.factory;

public class FacultyFactory {

	public Faculty getFaculty(FacultyEnum typeOfFaculty) {
		if (typeOfFaculty == null) {
			return null;
		}
		if (FacultyEnum.MATHS.equals(typeOfFaculty)) {
			return new MathsFaculty();
		}
		if (FacultyEnum.PHYSICS.equals(typeOfFaculty)) {
			return new PhysicsFaculty();
		}
		if (FacultyEnum.CHEMISTRY.equals(typeOfFaculty)) {
			return new ChemistryFaculty();
		}
		return null;
	}
}
