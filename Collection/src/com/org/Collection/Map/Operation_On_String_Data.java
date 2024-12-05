package com.org.Collection.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Operation_On_String_Data {
	public static void main(String[] args) {
		String name="Manjeet Kumar Yadav Manjeet ";
		
		LinkedHashMap<Character,Integer>smp=new LinkedHashMap<Character,Integer>();
		
		for(Character c:name.toCharArray())
		{
			if(smp.get(c)!=null)
			{
				smp.put(c, smp.get(c)+1);
			}
			else
			{
				smp.put(c,1);

			}
		}
		
		Set<Map.Entry<Character,Integer>> msb=smp.entrySet();
		int max=-123455;
		for(Map.Entry<Character,Integer> s:msb)
		{
//			if(s.getValue()==1)
//			{
			//First Non_repeating Element of the Array: 
//				System.out.println("Number is "+s.getKey());
//				break;
//			}
//			if(s.getValue()>1)
//			{
			//Print all the Element which Appear more 1 time
//				System.out.println(s.getKey());
//			}
//			if(s.getValue()==1)
//			{
			//Print all the Element Which is Equal to 1;
//				System.out.println(s.getKey());
//			}
//			if(s.getValue()%2==0)
//			{
//				//Print the Element which is Even Number Times.
//				System.out.println(s.getKey());
//			}
			
			if(s.getValue()!=null)
			{
				max=s.getValue();
			}
		}
		System.out.println("Maximum Number is This  "+max);
	}

}
