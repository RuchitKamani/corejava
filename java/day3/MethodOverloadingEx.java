package android;

public class MethodOverloadingEx 
{
	
	static int add(int a,int b)
	{
		return a*b;
	}
	static double add(int a,double b)
	{
		return a+b;
	}
	
	public static void main(String[] args)
	{
		System.out.println(add(1, 5));
		System.out.println(add(1, 2.5));
	}
}
