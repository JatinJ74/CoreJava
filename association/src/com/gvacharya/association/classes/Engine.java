package com.gvacharya.association.classes;

public class Engine {

	private int stokes;
	private boolean isPowerStation;
	private boolean isPetrol;
	public Engine(int stokes, boolean isPowerStation, boolean isPetrol) {
		super();
		this.stokes = stokes;
		this.isPowerStation = isPowerStation;
		this.isPetrol = isPetrol;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStokes() {
		return stokes;
	}
	public void setStokes(int stokes) {
		this.stokes = stokes;
	}
	public boolean isPowerStation() {
		return isPowerStation;
	}
	public void setPowerStation(boolean isPowerStation) {
		this.isPowerStation = isPowerStation;
	}
	public boolean isPetrol() {
		return isPetrol;
	}
	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}
	@Override
	public String toString() {
		return "Engine [stokes=" + stokes + ", isPowerStation=" + isPowerStation + ", isPetrol=" + isPetrol + "]";
	}
	
	
}
