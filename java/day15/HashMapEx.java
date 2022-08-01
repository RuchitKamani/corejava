package com.exception1;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx 
{
	public static void main(String[] args) 
	{
		
		HashMap<String,Integer>map=new HashMap<>();
		
		map.put("a1", 101);
		map.put("a2", 102);
		map.put("a3", 103);
		map.put("a4", 104);
		
		//System.out.println(map.get("a1"));
		
		for(Map.Entry<String,Integer>m:map.entrySet())
		{
			System.out.println("Value : - "+m.getValue());
			System.out.println("Key : - "+m.getKey());
		}
		
		
	}
}
