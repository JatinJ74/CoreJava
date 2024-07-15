package com.gvacharya.multithreading.polling.classes;

public class MessageConsumer implements Runnable{

	MessagePrint  print;

	public MessageConsumer(MessagePrint print) {
		super();
		this.print = print;
	}
	
	public void getMessage() {
		String msg="";
		while(!msg.equals(0)) {
			msg = print.getMsg();
			System.out.println("get:" + msg);
		}
		 
	}

	@Override
	public void run() {
		getMessage();
		
	}

}