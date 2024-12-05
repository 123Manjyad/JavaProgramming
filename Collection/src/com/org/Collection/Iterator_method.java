package com.org.Collection;

import java.net.CacheResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_method {

	public static void main(String[] args) {
		Collection c=new ArrayList<Integer>();
		c.add("Manjeet Yadav");
		c.add("Manohar Mangolkar");
		c.add("Exception");
		c.add("Pyar");
		c.add("Sex");
		
		c.addAll(c);
//		System.out.println(c);
//		c.remove("Sex");
//		c.removeAll(c);
//		
//	
//		c.add("Manjeet Yadav");
//		c.add("Manohar Mangolkar");
//		c.add("Exception");
//		c.add("Pyar");
//		c.add("Sex");
//		
//		c.addAll(c);
//		c.add("Exception");
//		c.add("Pyar");
//		c.add("Sex");
//		c.retainAll(c);
		
		
		Iterator itr=c.iterator();
		
		while(itr.hasNext())
		{
			System.err.println(itr.next());
			
		}

	}
}
