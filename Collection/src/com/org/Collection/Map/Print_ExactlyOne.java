package com.org.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Print_ExactlyOne {
	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>();
		Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
		
		ar.add(4578);
		ar.add(7485);
		ar.add(1235);
		ar.add(78965);
		ar.add(4578);
		ar.add(4569);
		ar.add(5678);
		ar.add(4569);
		ar.add(789546);
		ar.add(456789);
		ar.add(86598);
		ar.add(7485);
		ar.add(1235);
		ar.add(78965);
		
		for(Integer it:ar)
		{
			if(mp.get(it)!=null)
			{
				mp.put(it, mp.get(it)+1);
			}
			else
			{
				mp.put(it, 1);
			}
		}
		
		Set<Map.Entry<Integer,Integer>> m=mp.entrySet();
		System.out.println("Number which is not repeated are :");
		for(Map.Entry<Integer, Integer> ent:m)
		{
			if(ent.getValue()==1)
			{
				System.out.println(ent.getKey());
			}
		}
		
		
	}

}
