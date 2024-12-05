package com.org.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Set_Implementation {
	public static void main(String[] args) {
		Set<Object> hs=new HashSet<>();
		
        Collection<Object> ob=new ArrayList<Object>();
        ob.add("Love the nature the Way it is");
        ob.add("Love the nature the Way it is");
        ob.add("Love the nature the Way it is");
        ob.add("Love the nature the Way it is");
        
        ob.add("Love the nature the Way it is");
		Set<Object> hs1=new HashSet<Object>();
		Set<Object> hs2=new HashSet<Object>(ob);
	  
	     Set<Integer> hasint=new HashSet<Integer>(10, 700);
		 Set<String>  haset=new HashSet<>(10);
		 
		 System.out.println(haset.size());
		 System.out.println(hs1.size());
		 System.out.println(hs2.size());
		 System.out.println(hasint.size());
		
		}

}
