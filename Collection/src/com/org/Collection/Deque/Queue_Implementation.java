package com.org.Collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


public class Queue_Implementation {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		dq.add(2344);
		dq.addFirst(89);
		dq.addLast(8907);
		dq.offerFirst(2020);
		System.out.println(dq.getFirst());
		dq.offerLast(1232);
		dq.removeFirst();
		dq.removeLast();
		int poll=dq.pollFirst();
		int poll1=dq.pollLast();
		int m=dq.getFirst();
		int n=dq.peekFirst();
		int s=dq.peekLast();
		
		dq.removeFirstOccurrence(poll);
		dq.removeLastOccurrence(n);
		
		System.out.println(poll+", "+poll1+", "+m+", "+n+", "+s);
		
		List l1=new LinkedList();
	    Deque<Integer> dq1=new LinkedList<Integer>();
	    LinkedList<Integer> ll=new LinkedList<Integer>();
	    ll.add(4567);
		
	  System.out.println(ll);
	}

	
}
