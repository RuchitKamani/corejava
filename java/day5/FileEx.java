package com.exception;

import java.io.FileOutputStream;

public class FileEx 
{
	public static void main(String[] args) 
	{
		try
		{
			String s="Hello from tops";
			FileOutputStream fout =new FileOutputStream("K://jenish.txt");
			fout.write(s.getBytes());
			
		}
		catch(Exception e)
		{
			System.err.print("Error");
		}
		
		System.out.println("success");
	
		
	}
}
