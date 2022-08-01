package com.b;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEX 
{
	public static void main(String[] args) {
		
		
		HashSet set = new HashSet<>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		set.add(1);
		
		HashSet set2=new HashSet<>();
		
		set2.add("a");
		set2.add("b");
		
		set.addAll(set2);
		
		Iterator i =set.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
