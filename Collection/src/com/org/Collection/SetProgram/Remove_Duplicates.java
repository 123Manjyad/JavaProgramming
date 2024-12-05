package com.org.Collection.SetProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {
	public static void main(String[] args) {
		
		Collection<Integer> arr=new ArrayList<Integer>();
		arr.add(1425);
		arr.add(124);
		arr.add(98);
		arr.add(76);
		arr.add(3456);
		arr.add(98);
		arr.add(98);arr.add(98);arr.add(98);arr.add(98);arr.add(98);arr.add(98);arr.add(98);arr.add(98);
		Set<Integer> st=new HashSet<Integer>();
		 for(Integer ob:arr)
		{
		
			 st.add(ob);
		
		}
		 
		 System.out.println(st);
		
		
	}

}
