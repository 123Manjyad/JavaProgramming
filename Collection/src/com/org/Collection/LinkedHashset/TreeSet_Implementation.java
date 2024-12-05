package com.org.Collection.LinkedHashset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Implementation {
	public static void main(String[] args) {
		Set<Object> ts=new TreeSet<>();
		
		System.out.println(ts.size());
		
		ts.add("Manjeet");
	     ts.add("Rohan");
	     ts.add("Shobha");
	     ts.add("Kamini");
	     ts.add("Ruksat Begam");
	     System.out.println(ts);
		Collection c=new ArrayList();
		c.add(38);
		c.add(348);
		c.add(374);
		c.add(4748);
		
		c.add(5748);
		Set<Object> ts_c=new TreeSet<>(c);
		 System.out.println(c);
				System.out.println(ts_c.size());
	}

}
