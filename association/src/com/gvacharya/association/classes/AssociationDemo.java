package com.gvacharya.association.classes;

public class AssociationDemo {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNoOfTyres(4);
		car1.setBrand("Toyota");
		System.out.println(car1);
		
		Engine engine = new Engine();
		engine.setPetrol(true);
		engine.setPowerStation(true);
		engine.setStokes(4);
		
		car1.setEngine(engine);
		
		System.out.println(car1);
		
		Engine engine1 = car1.getEngine();
		System.out.println(engine1);
		
	}
}
