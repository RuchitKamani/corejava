package android;

public class Svm 
{
	int id;
	String name;
	static String college="Atmiya";
	
	public Svm(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	static void change()
	{
		college="VVP";
	}
	public static void main(String[] args) {
		
		change();
		Svm s1 =new Svm(101, "jenish");
		Svm s2 =new Svm(102, "ruchit");
		
		s1.display();
		s2.display();
		
	}
	
}
