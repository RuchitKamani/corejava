package android;

class P
{
	void p()
	{
		System.out.println("p");
	}
}
class Q extends P
{
	void q()
	{
		System.out.println("q");
	}
}




public class Single 
{
	public static void main(String[] args) {
		
		Q q =new Q();
		q.q();
		q.p();
		
	}
}
