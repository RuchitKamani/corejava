import java.util.Scanner;

public class Student 
{
	int id;
	String name;
	
	public static void main(String[] args) 
	{
		
		//classname objname =new classanme();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your id");
		int id2=sc.nextInt();
		
		System.out.println("Enter your name");
		String name2=sc.next();
		
		
		Student s1 = new Student();
		Student s2 =new Student();
		
		s1.id=101;
		s1.name="tops";
		
		s2.id=id2;
		s2.name=name2;
		
		System.out.println(s1.id+" "+s1.name);
		
		System.out.println(s2.id+" "+s2.name);
		
	}
	
}
