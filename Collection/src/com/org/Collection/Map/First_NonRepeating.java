package com.org.Collection.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class First_NonRepeating {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		LinkedHashMap<Integer,Integer> mp=new LinkedHashMap<Integer, Integer>();
		
		arr.add(4785);
		arr.add(7412);
		arr.add(4125);
		arr.add(1425);
		arr.add(7412);
		arr.add(4125);
		//arr.add(1425);
		arr.add(7412);
		arr.add(4125);
		//arr.add(1425);
		arr.add(4785);
		
		for(Integer it:arr)
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
		
		Set<Map.Entry<Integer, Integer>> set=mp.entrySet();
		for(Map.Entry<Integer, Integer> m:set)
		{
			if(m.getValue()==1)
			{
				System.out.println("First Non-repeating Element from the Array :"+m.getKey());
				break;
			}
			
			
		}
	  
		
	}

}
