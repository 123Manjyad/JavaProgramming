package com.org.Collection.LinkedHashset;

import java.util.HashSet;
import java.util.Set;

public class Freq_Char {
	public static void main(String[] args) {
		Set<Character> ch=new HashSet<>();
		String s="Kya kr rhi ho jaan Please so jaao yaar Shobha Shobha Shobha Shobha Shobha";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				  ch.add(s.charAt(i));
			}
	
		}
		
		System.out.println(ch);
	}

}
