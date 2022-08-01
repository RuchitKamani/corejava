package android;

class H
{
	void h()
	{
		
		System.out.println("h");
			
	}
}
class J extends H
{
	void j()
	{
		System.out.println("j");
	}
}
interface K
{
	void k();
}
class L extends J implements K
{
	void l()
	{
		System.out.println("l");
	}

	@Override
	public void k() 
	{
		// TODO Auto-generated method stub
		System.out.println("k");
	}
}

public class HybridEx 
{
	public static void main(String[] args) {
		
		L l =new L();
		
		l.h();
		l.j();
		l.k();
		l.l();
		
	}
}
