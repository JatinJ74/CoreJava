package com.gvacharya.association.classes;

public class Car {

	
	private int noOfTyres;
	private String brand;
	
//	private Engine engine = new Engine();
	private Engine engine; //composition
	
	private MusicSystem musicSystem; //aggregation

	public Car(int noOfTyres, String brand, Engine engine, MusicSystem musicSystem) {
		this.noOfTyres = noOfTyres;
		this.brand = brand;
		this.engine = engine;
		this.musicSystem = musicSystem;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(int noOfTyres) {
		this.noOfTyres = noOfTyres;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public MusicSystem getMusicSystem() {
		return musicSystem;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	@Override
	public String toString() {
		return "Car [noOfTyres=" + noOfTyres + ", brand=" + brand + ", engine=" + engine + ", musicSystem="
				+ musicSystem + "]";
	}
	
	
}
