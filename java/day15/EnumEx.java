package com.exception1;

enum Student
{
	//John(11),a(1),b(2),c(3);
	John(11), Bella(10), Sam(13), Viraaj(9);
	

	private int age;
	
	private Student(int age) 
	{
		// TODO Auto-generated constructor stub
		this.age=age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

public class EnumEx 
{
	public static void main(String[] args) {
		
		System.out.println("answer is "+Student.Bella.getAge());
		
	}
}
