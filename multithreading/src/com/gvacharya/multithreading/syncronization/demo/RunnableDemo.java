package com.gvacharya.multithreading.syncronization.demo;
import com.gvacharya.multithreading.syncronization.demo.PrintMessage;
public class RunnableDemo implements Runnable{

	private PrintMessage printMessage;
	
	
	public RunnableDemo(PrintMessage printMessage) {
		this.printMessage = printMessage;
	}
	
	@Override
	public void run() {
		printMessage.printMessage();
	}


}
