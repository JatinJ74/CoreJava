package com.gvacharya.generic.mobilebill.framework;

public class PrePaid implements MobileBill<PrePaid>,Payable{

	private Integer noOfDays;

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public Float generateBill(PrePaid noOfDays) {
		return noOfDays.getNoOfDays() * 10.0F;
	}
	
	
}
