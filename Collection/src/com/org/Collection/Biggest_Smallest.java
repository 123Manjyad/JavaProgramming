package com.org.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Biggest_Smallest {
	public static void main(String[] args) {
		Collection c=new ArrayList<>();
		c.add("Manjeet Yadav");
		c.add("Manohar Mangolkar");
		c.addAll(c);
		c.add("Exception");
		c.add("Pyar");
		c.add("Sex");
		
		c.add(4578);
		c.add(4571);
		c.add(45781);
		c.add(56756);
		c.add(4578);
		c.add(4571);
		c.add(457811);
		c.add(56756);
		c.add(4578);
		c.add(4571);
		c.add(45781);
		c.add(56756);
		c.add(12321);
		c.add(56756);
		c.add(12321);
		c.add(12321);
		c.add(12321);c.add(12321);
		
		int max=-234422;
		int min=650093145;
		Iterator itr=c.iterator();
		while(itr.hasNext())
		{
			Object  m=itr.next();
			if( m instanceof Integer)
			{
				   int value=(Integer)m;
			       if (value > max) {
	                    max = value;  // Update max if current value is greater
	                }
	                if (value < min) {
	                    min = value;  // Update min if current value is smaller
	                }
	            }
			
		      
			}
		

		System.out.println("Smallest :  "+min);
		System.out.println("Biggest :  "+max);
		
	}

}
