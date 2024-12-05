package com.org.Collection.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Biggest {
	


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
	        int large=0;
	        while(it.size()!=1)
	        {
	        	large=it.poll();
	        	
	        }
	        System.out.println("Biggest and second Biggest number from the ArrayList is respectively : "+it.poll()+ " , "+large);
		
	        ll.add(1278);
			ll.add(5476);
			ll.add(5480);
			ll.add(8766);
			ll.add(5647);
			
			 for(Integer i:ll)
		        {
		        	it12.add(i);
		        }
			 
			    int large1=0;
		        while(it12.size()!=1)
		        {
		        	large1=it12.poll();
		        	
		        }
		       System.out.println("Biggest and second Biggest number from the LinkedList is respectively : "+it12.poll()+ " , "+large1);
			
			
		}

	}



