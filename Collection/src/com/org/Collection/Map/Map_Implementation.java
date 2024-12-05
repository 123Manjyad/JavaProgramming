package com.org.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Implementation {
	public static void main(String[] args) {
		
		Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
		mp.put(234, 1);
		mp.put(2342, 2);
		mp.put(2343, 2);
		mp.put(23422, 5);
		
		
		Map<Integer,Integer> mp1=new HashMap<Integer, Integer>();
		mp1.put(2314, 11);
		mp1.put(232, 20);
		mp1.put(43, 12);
		mp1.put(222, 15);
		
		Set<Map.Entry<Integer, Integer>> ent=mp.entrySet();
		System.out.println(ent);
		
		for(Map.Entry<Integer,Integer> p:ent)
		{
			System.out.println("The key of map is : "+p.getKey()+"  and the value is: "+p.getValue());
		}
		System.out.println("Size : "+mp.size());
		System.out.println(mp.isEmpty());
		System.out.println(mp.containsKey(234));
		System.out.println(mp.containsValue(3));
		System.out.println(mp.get(23422));
		System.out.println(mp.put(234, 48));
		System.out.println(mp.put(234, 7));
		System.out.println(mp.remove(23422));
		mp.putAll(mp1);
		//mp1.clear();
		System.out.println(mp1);
		//returns set   
		System.out.println(mp.keySet());
		//returns collection
		System.out.println(mp.values());
		//returns Set<Map.Entry<key,value>>
		System.out.println(mp.entrySet());
		
		//checks Equality of two map : returns boolean true or false
		System.out.println(mp.equals(mp1));
		//This method put the entry in map with key-value if It is not Already available in map:
		mp.putIfAbsent(7895, 124563);
		//This method will return true if this key-value pair is available in the map otherwise return false
		System.out.println(mp.remove(234, 7));
		
		//takes key and old value and replace with newer one.Returns true if replacement done or false if replacement is not done.
		System.out.println(mp.replace(2343,2,200));
		//this method take the key and value and replace if matches with key.
		System.out.println(mp.replace(2342, 4578));
		
		Set<Map.Entry<Integer,Integer>> set=mp.entrySet();
		for(Map.Entry<Integer, Integer> m:set)
		{
			System.out.println(m.getKey()+", "+m.getValue());
		}
		
		
		
	}

}
