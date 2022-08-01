package android;

public class StaticEx 
{
	static int counter=0;
	
	public StaticEx() 
	{
		counter++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) 
	{
		StaticEx s1 =new StaticEx();
		StaticEx s2 =new StaticEx();
		StaticEx s3 =new StaticEx();
	}
}
