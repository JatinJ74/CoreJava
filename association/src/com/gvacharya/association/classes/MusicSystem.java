package com.gvacharya.association.classes;

public class MusicSystem {

	private boolean  isTouchScreen;
	private boolean  isFM;
	public MusicSystem(boolean isTouchScreen, boolean isFM) {
		super();
		this.isTouchScreen = isTouchScreen;
		this.isFM = isFM;
	}
	public MusicSystem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public void setTouchScreen(boolean isTouchScreen) {
		this.isTouchScreen = isTouchScreen;
	}
	public boolean isFM() {
		return isFM;
	}
	public void setFM(boolean isFM) {
		this.isFM = isFM;
	}
	@Override
	public String toString() {
		return "MusicSystem [isTouchScreen=" + isTouchScreen + ", isFM=" + isFM + "]";
	}
	
}
