package com.string;

import java.util.Scanner;

public class Xyz 
{
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
	/*s*/
		
		System.out.println("Enter your password");
		String pass=sc.next();
		
		
		
		Peson p =new Peson();
		
		//p.setId(id);
	/*	p.setName(name);
		p.setSurname(surname);
		p.setEmail(email);*/
		
/*		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getSurname());
		System.out.println(p.getEmail());
		*/
		
		if(pass.length()>=4)
		{
			System.out.println("accepted");
		}
		if(pass.equals("1234"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Error");
		}
		
		
	}
}
