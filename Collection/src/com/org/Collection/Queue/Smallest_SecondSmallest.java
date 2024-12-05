package com.org.Collection.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Smallest_SecondSmallest {
	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		PriorityQueue<Integer> p1=new PriorityQueue<Integer>();
		PriorityQueue<Integer> p2=new PriorityQueue<Integer>();
		
		arr.add(9877);
		arr.add(1232);
		arr.add(1233);
		arr.add(2324);
		arr.add(2325);
		
		for(Integer i:arr)
		{
			p1.add(i);
		}
		int small=p1.poll();
		int second_small=p1.poll();
		System.out.println("Smallest and Second Smallest Number from the ArrayList :"+small+","+second_small);
		ll.add(9877);
		ll.add(1232);
		ll.add(1233);
		ll.add(2324);
		ll.add(2325);
	
		for(Integer i:ll)
		{
			p2.add(i);
		}
		int small1=p2.poll();
		int second_small1=p2.poll();
		System.out.println("Smallest and Second Smallest Number from the LinkedList :"+small1+","+second_small1);
	}

}
