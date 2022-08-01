package android;

class M
{
	String color="black";
}
class N extends M
{
	String color="white";

	void op()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperEx 
{
	public static void main(String[] args) {
		
		N n =new N();
		n.op();
		
	}
}
