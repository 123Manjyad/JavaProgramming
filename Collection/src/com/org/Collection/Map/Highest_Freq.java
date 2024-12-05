package com.org.Collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Highest_Freq {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(4578);
		arr.add(5896);
		arr.add(741);
		arr.add(785);
		arr.add(741);
		arr.add(741);
		arr.add(4578);
		arr.add(5896);
		arr.add(741);
		arr.add(785);
		arr.add(741);
  
		HashMap<Integer,Integer> mp=new HashMap<Integer, Integer>();

	   for(Integer i:arr)
	   {
		   if(mp.get(i)!=null)
		   {
			  mp.put(i, mp.get(i)+1);
		   }
		   
		   else
		   {
			   mp.put(i, 1);
		   }
	   }
	   
	   Set<Map.Entry<Integer, Integer>> set=mp.entrySet();
	   int max=-1345786;
	  int  key=-4567890;
	   for(Map.Entry<Integer,Integer> m: set)
	   {
		   if(max<m.getValue())
		   {
			   max=m.getValue();
			   key=m.getKey();
		   }
	   }

	   System.out.println("Maximum Element from the Array is :  "+max +"   their Key is :"+key);
	  
	}

}
