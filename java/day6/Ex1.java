package com.array;

class A
{
	
	A()
	{
		
		System.out.println("a");
	}
}
class B extends A
{
	
	
	B()
	{
		System.out.println("b");
	}
}
class C extends B
{
	C()
	{
		System.out.println("c");
	}
}

public class Ex1 
{
	public static void main(String[] args) {
		
		C c =new C();
		
	}
}
