package com.org.Collection.List;

import java.util.List;
import java.util.Stack;

public class Stack_Implementation {
	public static void main(String[] args) {
		Stack<Object> st=new Stack<>();
		st.add(2245);
		st.add("Manjeet");
		st.add('M');
		st.add(true);
		st.add(908.90);
		st.push(st);
		System.out.println(st);
		st.pop();
		System.out.println(st);
		Object ob=st.peek();
		boolean b=st.empty();
				
	    System.out.println(ob);
		System.out.println(b);
		
	  Object position=	st.search(2245);
		System.out.println(position);
		
		
	}

}
