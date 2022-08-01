package com.exception1;

import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector v =new Vector<>(5);
		
		v.add("Android");
		v.add("Java");
		v.add("Php");
		v.add("Android");
		v.add("Java");
		v.add("Php");
		v.add("Java");
		v.add("Php");
		v.add("Java");
		v.add("Php");
		v.add("Java");
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		if(v.contains("Php"))
		{
			System.out.println("matched");
		}
		else
		{
			System.out.println("Not Matched");
		}
		
	}
}
