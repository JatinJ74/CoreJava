package com.gvacharya.exception.arithematicoperationproject.utility;

public enum Menu {

	ADD(1,"Add two Numbers"),
	SUBSTRACTION(2,"Substract two Numbers"),
	MULTIPLY(3,"Multiply two Numbers"),
	DIVIDE(4,"Divide two Numbers");
	
	private String info;
	private int srNo;
	
	private Menu(int srNo,String info) {
		this.srNo = srNo;
		this.info = info;
		
	}

	public String getInfo() {
		return info;
	}

	public int getSrNo() {
		return srNo;
	}


	
	

	
}
