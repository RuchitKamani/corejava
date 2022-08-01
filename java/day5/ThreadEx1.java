package com.exception;

class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread A:"+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread B:"+i);
		}
	}
}

public class ThreadEx1 
{
	public static void main(String[] args) {
		
		A a =new A();
		B b =new B();
		
		a.start();
		b.start();
		
	}
}
