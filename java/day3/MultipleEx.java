package android;

class P1
{
	void p()
	{
		System.out.println("p accessed");
	}
}
class Q1
{
	void q()
	{
		System.out.println("q accessed");
	}
}
class R1 extends P1,Q1
{
	void r()
	{
		System.out.println("r accessed");
	}
}

public class MultipleEx 
{

}
