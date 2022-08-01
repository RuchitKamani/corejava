package com.exception1;

public class ThrowEx 
{
	
	static void validate(int age)
	{
		if(age>18)
		{
			System.out.println("success");
		}
		else
		{
			throw new ArithmeticException("Age is not valid");
		}
		
	}
	
	public static void main(String[] args) 
	{
		try
		{
			validate(15);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally 
		{
			System.out.println("abcd");
		}
		
	
		
	}
}
