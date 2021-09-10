package com.hari.abstactfactory;

public class AbstractFactortyTest {
	public static void main(String[] args) {
		AbstractFctory abstractFctory = AbstactFactoryProducer.getProfession(true);
		Faculty faculty = abstractFctory.getFaculty(AbstactFactoryEnum.MATHS);
		faculty.print();
		faculty = abstractFctory.getFaculty(AbstactFactoryEnum.PHYSICS);
		faculty.print();
		abstractFctory = AbstactFactoryProducer.getProfession(false);
		faculty = abstractFctory.getFaculty(AbstactFactoryEnum.MATHS);
		faculty.print();
		faculty = abstractFctory.getFaculty(AbstactFactoryEnum.PHYSICS);
		faculty.print();
	}
}
