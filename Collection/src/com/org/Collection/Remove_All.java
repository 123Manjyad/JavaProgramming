package com.org.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Remove_All {
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
				if((Integer)m%2==1)
				{
					itr.remove();
				}
			}
			
		}
		
		System.out.println(c);
	}

}
