package com.org.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveAll {

	public static void main(String[] args) {
		Collection c=new ArrayList<Integer>();
		c.add("Manjeet Yadav");
		c.add("Manohar Mangolkar");
		c.add("Exception");
		c.add("Pyar");
		c.add("Sex");
		
		c.addAll(c);
		System.out.println(c);
		c.removeAll(c);
		System.out.println(c);
	}
}
