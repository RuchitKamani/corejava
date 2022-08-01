package com.array;

public class GC 
{
	int id=0;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("called");
	}
	public static void main(String[] args) {
		
		
		
		
		GC g1 =new GC();
		GC g2 =new GC();
		GC g3 =new GC();
		
		g1=null;
		g2=null;
		g3.id=101;
		System.out.println(g3.id);
		System.gc();
	}
}
