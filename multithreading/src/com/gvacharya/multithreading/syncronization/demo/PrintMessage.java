package com.gvacharya.multithreading.syncronization.demo;

public class PrintMessage {

	private String  msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public synchronized void printMessage() {
		synchronized(this) {
		for(int i=0;i<10;i++) {
			try {
				System.out.println(msg + i);
				Thread.sleep(200);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		}
	}
}
