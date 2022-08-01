package android;


class Animal
{
	void a()
	{
		System.out.println("animal data accessed");
	}
}
class Dog extends Animal
{
	void d()
	{
		System.out.println("dog data accessed");
	}
}
class Cat extends Dog
{
	void c()
	{
		System.out.println("cat data accessed");
	}
}

public class Single1 
{
	public static void main(String[] args) {
		
		Cat d =new Cat();
		
		d.a();
		d.d();
		d.c();
		
		
	}
}
