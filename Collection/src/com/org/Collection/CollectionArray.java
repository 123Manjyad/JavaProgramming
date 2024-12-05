package com.org.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionArray {

	public static void main(String[] args) {
		

	Collection c=new ArrayList();
	c.add(4578);
	c.add("Manjeet Kuamr");
	c.add("M");
	c.add("Manjeet_Yadav");
	c.add(true);
	c.add(false);
	c.add("Human");
	c.add("Lesbian");
	
	Object[] arr=c.toArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	}
	
}
