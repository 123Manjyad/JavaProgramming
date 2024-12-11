package org.qsp.CollectionString;

public class LargestString {
	
	public static void main(String[] args) {
		String s1="  mohan is here and      there     ";
		/*
		 * String[] len=s1.split("\s+");
		 
		s1.sp
		System.out.println(len);
		System.out.println("Total Word is: "+len);
		for(String s:len)
		{
			System.out.print(s+" ");
		}
		*/
		String s="23a34P3qR30T5k100";
		String[] p=s.split("[a-zA-Z]+");
		System.out.println(p.length);
	}
	

}
