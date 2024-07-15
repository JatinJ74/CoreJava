package com.gvacharya.exception.arithematicoperationproject.utility.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.gvacharya.exception.arithematicoperationproject.customexceptions.DivideByZeroException;
import com.gvacharya.exception.arithematicoperationproject.customexceptions.InvalidPathNameException;

public interface ArithematicOperationService {

	int addition(int num1,int num2) throws FileNotFoundException, IOException, InvalidPathNameException;
	int substraction(int num1,int num2) throws  InvalidPathNameException, FileNotFoundException, IOException;
	int multiplication(int num1,int num2) throws  InvalidPathNameException, FileNotFoundException, IOException;
	int division(int num1,int num2) throws InvalidPathNameException, DivideByZeroException, FileNotFoundException, IOException;
}
