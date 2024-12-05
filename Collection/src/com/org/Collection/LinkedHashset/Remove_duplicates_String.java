package com.org.Collection.LinkedHashset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Remove_duplicates_String {
	public static void main(String[] args) {
		Set<String> s=new TreeSet<>();
		s.add("Manjeet");
		s.add("Manjeet");
		s.add("Manjeet");
		s.add("Manjeet");
		s.add("Manjeet");
		s.add("Manjeet");
		s.add("Manjeet Kumar");
		s.add("Manjeet Shobha ");
		s.add("Haha baby ");

	  Set<String>  sm=new HashSet<>() ;
	  sm.addAll(s);
	  System.out.println(sm);

	}

}
