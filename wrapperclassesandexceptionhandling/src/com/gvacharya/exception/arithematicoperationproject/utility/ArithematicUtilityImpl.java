package com.gvacharya.exception.arithematicoperationproject.utility;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.gvacharya.exception.arithematicoperationproject.customexceptions.DivideByZeroException;
import com.gvacharya.exception.arithematicoperationproject.customexceptions.InvalidPathNameException;
import com.gvacharya.exception.arithematicoperationproject.utility.service.ArithematicOperationServiceImpl;

public class ArithematicUtilityImpl implements ArithematicUtility{

	ArithematicOperationServiceImpl service = new ArithematicOperationServiceImpl();
	@Override
	public int printMenu(Scanner sc) throws Exception {
		int choice = 0;
		for(Menu menu:Menu.values())
			System.out.println(menu.getSrNo() + "." + menu.name() +"("+ menu.getInfo()+")");
		
		try {
				choice = sc.nextInt();
		}catch(InputMismatchException ime) {
				throw new Exception("Please Enter Valid Number",ime);
		}
		
		return choice;
	}

	@Override
	public void addition(Scanner sc) {
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		try {
			try {
				System.out.println(service.addition(number1, number2));
			} catch (InvalidPathNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void substraction(Scanner sc) {
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		try {
			System.out.println(service.substraction(number1, number2));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPathNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void multiplication(Scanner sc) {
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		try {
			System.out.println(service.multiplication(number1, number2));
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPathNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void division(Scanner sc) {
		System.out.println("Enter two numbers: ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		try {
			try {
				System.out.println(service.division(number1, number2));
			} catch (DivideByZeroException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidPathNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
