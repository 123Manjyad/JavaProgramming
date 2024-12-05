package com.org.Collection.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Print_NonrepeatingElement {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(4785);
		a.add(7845);
		a.add(4785);
		a.add(7852);
		a.add(4781);
		a.add(4710);
		a.add(4785);
		a.add(7852);
		a.add(4781);
		a.add(4710);
		
		LinkedHashMap<Integer,Integer> mp=new LinkedHashMap<Integer, Integer>();
		//Set<Map.Entry<Integer,Integer>> ms=mp.entrySet();
		for(Integer it:a)
		{
			if(mp.get(it)!=null)
			{
				mp.put(it, mp.get(it)+1);
			}
			else
			{
				mp.put(it,1);
			}
		}
		String s=Print_NonrepeatingElement.NonRepeating(mp);
		System.out.println(s);
	}
	
	public static String NonRepeating(LinkedHashMap<Integer,Integer> mp)
	{
		
		
		Set<Map.Entry<Integer, Integer>> it=mp.entrySet();
		int count=0;
		for(Map.Entry<Integer, Integer> m :it)
		{
			count++;
			if(m.getValue()==1)
			{
				
				System.out.println(m.getKey()+" ," +count);
				return " ";
			}
		}
		
		return "-1,-1";
	}

}
