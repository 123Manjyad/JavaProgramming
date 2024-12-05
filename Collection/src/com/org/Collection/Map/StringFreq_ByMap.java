package com.org.Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringFreq_ByMap {
	
	public static void main(String[] args) {
		String s="Naam kya hai babuni kya kr rhi ho tum";
		HashMap<Character,Integer>  mp=new HashMap<Character, Integer>();
		
		 for (char c : s.toCharArray()) {
			    
			 if(mp.containsKey(c))
			 {
				 mp.put(c,mp.get(c)+1);
 		     }
	            
			 else
			 {
				 mp.put(c, 1);
			 }
	        }
		 
		 Set<Map.Entry<Character, Integer>> set=mp.entrySet();
		 for(Map.Entry<Character,Integer> m:set)
		 {
			 System.out.println("Character ch is Present  :  "+m.getKey()+"     The Count is this  :  "+m.getValue());
		 }
	}

}
