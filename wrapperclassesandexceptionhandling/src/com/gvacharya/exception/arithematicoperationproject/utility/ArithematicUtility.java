package com.gvacharya.exception.arithematicoperationproject.utility;

import java.util.Scanner;

public interface ArithematicUtility {

	int printMenu(Scanner sc) throws Exception;
	
	void addition(Scanner sc);
	void substraction(Scanner sc);
	void multiplication(Scanner sc);
	void division(Scanner sc);
}
