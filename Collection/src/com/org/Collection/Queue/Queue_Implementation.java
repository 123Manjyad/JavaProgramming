package com.org.Collection.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Implementation {
	public static void main(String[] args) {
		Queue<String> qs=new PriorityQueue<String>();
		qs.add("Manjeet Kumar");
		qs.add("Manjeet Yadav");
		qs.add("Manjeet Yaduvansi");
		qs.add("Manjeet Krishna");
		qs.add("Manjeet Rai");
		qs.add("Manjeet Ray");
		System.out.println(qs);

	 Queue<Integer> qs13=new PriorityQueue<>();
	 Queue<Object> qs23=new PriorityQueue<>();
	 Collection<Integer> c=new ArrayList<>();
     List<Object> l=new LinkedList<>();
     l.add("Manjjeet");
     l.add("Manjeet Kumar");
     l.add("Shobha Kumari");
     l.add("Narmta kumari");
     l.add("Susil Kumar");
     
	c.add(2333);
	c.add(2343);
	c.add(1232);
	c.add(2343);
	c.add(2343);
	c.add(1232);
	c.add(2343);
	c.add(2332);
	  for(Integer t:c)
	  {
		  qs13.add(t);
	  }
	  
	  System.out.println(qs13);
	
	  for(Object ob:l)
	  {
		  qs23.add((String)ob);
	  }
	  
	  System.out.println(qs23);
	}
}
