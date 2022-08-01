package android;

public class ParaEx 
{
	int id;
	String name;
	
	
	public ParaEx(int id,String name) 
	{
		this.id=id;
		this.name=name;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		
		ParaEx p1 =new ParaEx(101, "tops");
		ParaEx p2 =new ParaEx(102, "tops2");
		
		p1.display();
		p2.display();
		
		
	}
}
