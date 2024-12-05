package com.org.Collection.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Biggest_Second_Biggest_from_Array_List {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		l.add(1278);
		l.add(5476);
		l.add(5480);
		l.add(8766);
		l.add(5647);
	
		
		PriorityQueue<Integer> it=new PriorityQueue<Integer>();
		PriorityQueue<Integer> it12=new PriorityQueue<Integer>();
        for(Integer i:l)
        {
        	it.add(i);
        }
        int second_Biggest=-45678;
         while(it.size()!=0)
        {
        	  if(it.size()>=2)
        	  {
        		  second_Biggest=it.remove(); 
        	  }
          
        }
        int bigg=it.poll();
     
		System.out.println("Biggest number from Arry is "+bigg+"  Second Biggest  "+second_Biggest);
		it.remove();
		
        ll.add(1278);
		ll.add(5476);
		ll.add(5480);
		ll.add(8766);
		ll.add(5647);
		
		 for(Integer i:ll)
	        {
	        	it12.add(i);
	        }
		 
	     int second_Biggest1=0;
	        while(it.size()!=0)
	        {
	        	  if(it.size()>=2)
	        	  {
	        		  second_Biggest1=it.remove(); 
	        	  }
	          
	        }
	        int bigg1=it.poll();
			System.out.println("Biggest number from Arry is "+bigg1+"  Second Biggest  "+second_Biggest);
	}

}
