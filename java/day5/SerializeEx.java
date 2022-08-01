package com.exception;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEx 	
{
	public static void main(String[] args) {
		
		try
		{
			Student s1 =new Student(101, "tops");
			FileOutputStream fout =new FileOutputStream("E://tops2.txt");
			ObjectOutputStream out =new ObjectOutputStream(fout);
			out.writeObject(s1);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
		
		
	}
}
