package com.gvacharya.exception.arithematicoperationproject.utility.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.gvacharya.exception.arithematicoperationproject.customexceptions.DivideByZeroException;
import com.gvacharya.exception.arithematicoperationproject.customexceptions.InvalidPathNameException;
import com.gvacharya.exception.arithematicoperationproject.utility.Dao.ArithematicOperationDao;
import com.gvacharya.exception.arithematicoperationproject.utility.Dao.ArithematicOperationDaoImpl;

public class ArithematicOperationServiceImpl implements ArithematicOperationService{

	ArithematicOperationDao dao = new ArithematicOperationDaoImpl();
	
	@Override
	public int addition(int num1, int num2) throws FileNotFoundException, IOException, InvalidPathNameException{
		
		return dao.addition(num1+num2);
	}

	@Override
	public int substraction(int num1, int num2) throws FileNotFoundException, IOException, InvalidPathNameException {
		// TODO Auto-generated method stub
		return dao.substraction(num1-num2);
	}

	@Override
	public int multiplication(int num1, int num2) throws FileNotFoundException, IOException, InvalidPathNameException {
		// TODO Auto-generated method stub
		return dao.multiplication(num1*num2);
	}

	@Override
	public int division(int num1, int num2) throws FileNotFoundException, IOException, InvalidPathNameException, DivideByZeroException {
		// TODO Auto-generated method stub
		int result;
		try {
				result = dao.division(num1/num2);
			}catch(ArithmeticException e) {
			result = 0;
			throw new DivideByZeroException("Divide by zero");
		}
		return result;
	}

	
}
