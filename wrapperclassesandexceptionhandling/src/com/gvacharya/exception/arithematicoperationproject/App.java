package com.gvacharya.exception.arithematicoperationproject;

import java.util.Scanner;

import com.gvacharya.exception.arithematicoperationproject.utility.ArithematicUtility;
import com.gvacharya.exception.arithematicoperationproject.utility.ArithematicUtilityImpl;

public class App {

	public static void main(String[] args) {

		ArithematicUtility helper = new ArithematicUtilityImpl();
		int choice =0;
		
		try (Scanner sc = new Scanner(System.in);) {
			do {
				choice = helper.printMenu(sc);
			
			switch(choice) {
			case 1->helper.addition(sc);
			case 2->helper.substraction(sc);
			case 3->helper.multiplication(sc);
			case 4->helper.division(sc);
			case 0->System.out.println("Exit");
			default -> System.out.println("Invalid input!");
			}
		
		}while(choice!=0);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
