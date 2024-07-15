package com.gvacharya.expressionstatementblock;

public class ExpressionStatementBlock {
	public static void main(String[] args) {
		//Expression and statement
		int variable1 = 6;
		int variable2 = 6*7*6; //Rigorous expression
	}
	
		//block
	{
		int number2=10;
		int number1=number2++;
		System.out.println(number1);
	}
	
		// text block
	{
		String message = """
								Hi, How are you? 
								Good.
							
						""";
		System.out.println(message);
	}
}

