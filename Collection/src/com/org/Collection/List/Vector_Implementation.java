package com.org.Collection.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Implementation {
	
	public static void main(String[] args) {
		
		//Vector<String> v5 = new Vector<String>(10, 0.9);	
		Vector<String > v=new Vector<>();
		Vector<String>  v1=new Vector(30);
		Collection c=new ArrayList();
		c.add(87);
		c.add(768);
		c.add(4785);
		c.add(471);
		c.add("What a nice Name you Have");
		Vector<Collection> v2=new Vector(c);
		
//	//	Vector<String> v3=new Vector<String>(10,0.9);
//		System.out.println(v.capacity());
//		System.out.println(v1.capacity());
//		System.out.println(v2.capacity());
//	//	System.out.println(v3.capacity());
//		v2.ensureCapacity(45);
//		System.out.println(v.capacity());
//		System.out.println(v1.capacity());
//		System.out.println(v2.capacity());
//		
		Iterator itr=v2.iterator();
//	   for(int i=0;i<v2.size();i++)
//		{
//			System.out.println(v2.elementAt(i));
//		}
//	
		
		System.out.println(v2.firstElement());
		System.out.println(v2.lastElement());
		//v2.insertElementAt(457, 4);
		v2.insertElementAt(v2, 5);
	//	Collection ob=(Collection)new Object();
		//v2.insertElementAt(ob, 5);
	     System.out.println(v2.lastElement());
	    // v2.clear();
	     System.out.println(v2);
	     v2.set(1, c);
	     
	     System.out.println(v2);
	     
	     
		
		
	}
	

}
