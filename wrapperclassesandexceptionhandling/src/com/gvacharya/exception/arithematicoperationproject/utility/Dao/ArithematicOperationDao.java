package com.gvacharya.exception.arithematicoperationproject.utility.Dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.gvacharya.exception.arithematicoperationproject.customexceptions.InvalidPathNameException;

public interface ArithematicOperationDao {

	int addition(int result) throws FileNotFoundException, IOException, InvalidPathNameException ;
	int substraction(int result) throws FileNotFoundException, IOException, InvalidPathNameException;
	int multiplication(int result) throws FileNotFoundException, IOException, InvalidPathNameException;
	int division(int result) throws FileNotFoundException, IOException, InvalidPathNameException;
}
