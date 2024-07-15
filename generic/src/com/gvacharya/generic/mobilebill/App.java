package com.gvacharya.generic.mobilebill;

import com.gvacharya.generic.mobilebill.framework.MobileBill;
import com.gvacharya.generic.mobilebill.framework.PostPaid;
import com.gvacharya.generic.mobilebill.framework.PrePaid;

public class App {

	public static void main(String[] args) {
		
		PostPaid airtel = new PostPaid();
		airtel.setNoOfDays(30);
		float postPaidBill = airtel.generateBill(airtel);
		System.out.println(postPaidBill);
		
		PrePaid idea = new PrePaid();
		idea.setNoOfDays(30);
		float prePaidBill = idea.generateBill(idea);
		System.out.println(prePaidBill);
		
		MobileBill<PrePaid> mobilePrePaid = (jio -> {
				jio.setNoOfDays(30);
				return jio.generateBill(jio);
		});
		
		System.out.println(mobilePrePaid.generateBill(new PrePaid()));
		
		MobileBill<PostPaid> mobilePostPaid = (jio -> {
			jio.setNoOfDays(30);
			return jio.generateBill(jio);
		});
		
		System.out.println(mobilePostPaid.generateBill(new PostPaid()));
		
	}
}
