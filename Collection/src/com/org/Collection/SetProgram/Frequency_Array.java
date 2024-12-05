package com.org.Collection.SetProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Frequency_Array {
  public static void main(String[] args) {
    Collection<Integer> c=new ArrayList<>();
    c.add(67);
    c.add(76);
    c.add(76);
    c.add(76);
    c.add(65);
    c.add(67);
    c.add(565);
    c.add(75);
    int count=0;
    Set<Integer> st=new HashSet<>();
    st.addAll(c);
    System.out.println(st);
    
    for(Integer s:st)    	
    {
    	count=0;
    	for(Integer ct:c)
    	{
    		if(s==ct)
    		{
    			count++;
    		}
    	}
    	System.out.println(" Count of the array Element "  +s+   " Is : "+count);
    	
    }
    
}
}
