package com.org.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Print_freq_Even_Number {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
		arr.add(2343);
		arr.add(21);
		arr.add(2342);
		arr.add(322);
		arr.add(2324);
		arr.add(2342);
		arr.add(322);
		arr.add(2324);
		arr.add(2324);
		arr.add(2342);
		arr.add(322);
		arr.add(2324);
		arr.add(2324);
		arr.add(2342);
		arr.add(322);
		arr.add(2324);
		
		for(Integer n:arr)
		{
			if(mp.get(n)!=null)
			{
				mp.put(n, mp.get(n)+1);
			}
			else
			{
				mp.put(n, 1);
			}
		}
		Set<Map.Entry<Integer,Integer>> s=mp.entrySet();
		for(Map.Entry<Integer,Integer> x:s)
		{
			if(x.getValue()%2==0)
			{
				System.out.println("Number "+x.getKey()+" Is Present "+x.getValue()+" Times ");
			}
		}
		
	}

}
