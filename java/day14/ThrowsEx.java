package com.exception1;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("m1");
	}
}
class N extends M
{
	void n() throws IOException
	{
		m();
	}
}
class p extends N
{
	void p()
	{
		try {
			n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class ThrowsEx 
{
	public static void main(String[] args) {
		
		
		p p1 =new p();
		
		try {
			p1.m();
			p1.n();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		p1.p();
		
	}
}	
