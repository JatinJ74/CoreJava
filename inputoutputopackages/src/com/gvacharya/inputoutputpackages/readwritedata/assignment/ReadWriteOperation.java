package com.gvacharya.inputoutputpackages.readwritedata.assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ReadWriteOperation {

	public static void main(String[] args) throws IOException {
		String line = "";
		StringBuilder sBuilder = new StringBuilder();
		try (
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("demo.txt"));
				
				
				){
					System.out.println("Enter text: ");
					while(!line.equals("$")) {
						line = br.readLine();
						if(!line.equals("$"))
							
							bw.write(line);
							bw.newLine();
					}
			
		}
		
		try(
				BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
				){
			
				while((line = br.readLine())!= null) {
					
					sBuilder.append(line);
					System.out.println(line);
					
				}
				
				String result = sBuilder.toString();
				
				
				StringTokenizer tokens = new StringTokenizer(result,"[,.; ]");
				String[] tokenArray = new String[tokens.countTokens()]; 
				int i = 0;
				while(tokens.hasMoreTokens()) 
					tokenArray[i++] = tokens.nextToken();
					
				
				System.out.println(Arrays.toString(tokenArray));
				
				int counter = 0;
				for(String str:tokenArray) 
					if(str.equalsIgnoreCase("shelu"))
						counter++;
				
					
				System.out.println("Shelu:" + counter);
					
						
		}
		
		
	}
}
