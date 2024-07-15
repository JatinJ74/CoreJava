package com.gvacharya.inputoutputpackages.readwritedata;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {

	public static void main(String[] args) throws IOException {
		//input keyboard
		
//		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
//			System.out.println(br.read()); isr method read()
			System.out.println("Enter a number: ");
			int number = Integer.parseInt(br.readLine());
			System.out.println(number);
//			System.out.println(br.readLine()); //br method readLine()
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			isr.close();
			br.close();
		}
		
		//file read write Operation
		
		try(
				FileWriter fr = new FileWriter("demo.txt");
				BufferedWriter br1 = new BufferedWriter(fr);
				){
			br1.write("sadfkaln;sdfk");
		}
		
		
	} 
}
