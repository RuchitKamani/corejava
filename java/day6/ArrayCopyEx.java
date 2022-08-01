package com.array;

public class ArrayCopyEx 
{
	public static void main(String[] args) {
		
		
		int A[]= {5,6,7,8,9};
		
		int B[] = new int[10];
		
		System.arraycopy(A, 0, B, 2, 3);
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		for(int i=0;i<4;i++)
		{
			System.out.println(B[i]);
		}
		
		
	}
}
