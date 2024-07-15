package com.gvacharya.exception.arithematicoperationproject.utility.Dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import com.gvacharya.exception.arithematicoperationproject.customexceptions.InvalidPathNameException;

public class ArithematicOperationDaoImpl implements ArithematicOperationDao{

	@Override
	public int addition(int result) throws FileNotFoundException, IOException, InvalidPathNameException{
		
		try(
				Writer fw = new FileWriter("addition.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
				){
			
			bw.write((result) + "");
			
		
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for writing Purpose",e);
		}
		
		try(
				Reader fr = new FileReader("addition.txt");
				BufferedReader br = new BufferedReader(fr);
				
				){
			
			result = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for reading Purpose",e);
		}
		
		
		return result;
	}

	@Override
	public int substraction(int result) throws FileNotFoundException, IOException, InvalidPathNameException{
		// TODO Auto-generated method stub
		
		try(
				Writer fw = new FileWriter("substraction.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
				){
			
			bw.write((result) + "");
			
		
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for writing Purpose",e);
		}
		
		try(
				Reader fr = new FileReader("substraction.txt");
				BufferedReader br = new BufferedReader(fr);
				
				){
			
			result = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for reading Purpose",e);
		}
	
		
		return result;
		
	}

	@Override
	public int multiplication(int result) throws FileNotFoundException, IOException, InvalidPathNameException{
		// TODO Auto-generated method stub
		
		try(
				Writer fw = new FileWriter("multiplication.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
				){
			
			bw.write((result) + "");
			
		
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for writing Purpose",e);
		}
		
		try(
				Reader fr = new FileReader("multiplication.txt");
				BufferedReader br = new BufferedReader(fr);
				
				){
			
			result = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for reading Purpose",e);
		}
	
		
		return result;
		
	}

	@Override
	public int division(int result) throws FileNotFoundException, IOException, InvalidPathNameException {
		// TODO Auto-generated method stub
		
		try(
				Writer fw = new FileWriter("division.txt");
				BufferedWriter bw = new BufferedWriter(fw);
				
				
				){
			
			bw.write((result) + "");
			
		
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for writing Purpose",e);
		}
		
		try(
				Reader fr = new FileReader("division.txt");
				BufferedReader br = new BufferedReader(fr);
				
				){
			
			result = Integer.parseInt(br.readLine());
		}catch(IOException e) {
			throw new InvalidPathNameException("Path  Name is Invalid for reading Purpose",e);
		}
	
		
		return result;
		
	}
}
