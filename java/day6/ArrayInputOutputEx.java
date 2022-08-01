package com.array;

import java.util.Scanner;

public class ArrayInputOutputEx 
{
	public static void main(String[] args) 
	{
		
		
		int A[] = new int[6];
		System.out.println("Enter 10 Numbers : - " );
		
		
		for(int i=0;i<=5;i++) 
		{
			Scanner sc=new Scanner(System.in);
			A[i]=sc.nextInt();
		}
		
		int B[] = new int[10];
		System.arraycopy(A, 0, B, 0, 6);
		
		for(int i=0;i<B.length;i++) {
			System.out.println("My Array is : - "+B[i]+"  "+i);
		}
		
	}
}
