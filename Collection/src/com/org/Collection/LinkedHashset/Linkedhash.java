package com.org.Collection.LinkedHashset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhash {
	public static void main(String[] args) {
	    Set<Object> s=new LinkedHashSet<Object>();
	    
	    Set<Object> sem=new LinkedHashSet<Object>(102);
	    Set<Object> po=new LinkedHashSet<Object>(40,1);
	    Collection<Integer> c=new ArrayList<>();
	    c.add(4578);
	    c.add(4);
	    c.add(78);
	    c.add(78);
	    c.add(4512);
	    Set<Object> politics=new LinkedHashSet<Object>(c);
	
	    
	    System.out.println(s.size());
	    System.out.println(sem.size());
	    System.out.println(po.size());
	    System.out.println(c.size());
	    System.out.println(politics.size());
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
