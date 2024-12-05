package com.org.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List_Iterator {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add(87);
		l.add(45);
		l.add("manjeet");
		l.add("M");
		l.add(4785);
		
		ListIterator lit=l.listIterator();
		ListIterator li=l.listIterator(1);
	
	    ListIterator lig=l.listIterator(0);
		while(lig.hasNext())
		{
			System.out.println(lig.next());
		    lig.set(74);
	
		}
		
		li.add(417854);
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
	
	}

}
