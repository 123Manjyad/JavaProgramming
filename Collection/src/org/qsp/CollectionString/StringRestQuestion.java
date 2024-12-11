package org.qsp.CollectionString;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringRestQuestion {
	
	public static Set<String>  PermutaionOfStringG(String str)
	{
		HashSet<String>  st=new HashSet<>();
		String s="",x="";
	     int n=str.length(),j=0;
	     for(int i=0;i<n;i++)
	     {
	    	 s+=(str.charAt(i));
	    	 j=i+1;
	    	 while(j<str.length())
	    	 {
	    		 x+=(str.charAt(j));
	    		 s+=x;
	    		 st.add(s);
	    		 j++;
	    		
	    	 }
	    	 s="";
	    	 x="";
	     }
	    return st;
	}
	public static String FirstCharacterOfEachStringUpperAndRestLower(String str)
	{
		StringBuilder ans=new StringBuilder("");
		String[]  strarr=str.split("\\.");
		     for(String s:strarr)
		     {
		    	 if(!s.isEmpty())
		    	 {
			    	 ans.append(Character.toUpperCase(s.charAt(0)));
		    	 
		    	
	          
		    	 for(int i=1;i<s.length();i++)
		    	 {
		    		 ans.append(Character.toLowerCase(s.charAt(i)));
		    	 }
		    	 
		    	 }
//		    	  ans.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(".");
		     }

		  String ans1=ans.toString().trim();
      return ans1;
  }
	public static String FirstCharacterOfEachString(String str)
	{
		StringBuilder ans=new StringBuilder("");
		String[]  strarr=str.split("\\.");
		     for(String s:strarr)
		     {
		    	  ans.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(".");
		     }

		  String ans1=ans.toString().trim();
      return ans1;
  }
	public static String SortingWord(String str)
	{
		String ans="";
		String[]  strarr=str.split(" ");
		     Arrays.sort(strarr);
		     
		     for(String s:strarr)
		     {
		    	 ans+=s+" ";
		     }

  return ans;
  }
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the String or statment that should perform your operation please :::::");
		String s=sc.nextLine();
		System.out.println("Display Sorted Word enter by User :::::");
		System.out.println(SortingWord(s));
		System.out.println("Display Accurately Idented Word :::::");
		System.out.println(FirstCharacterOfEachString(s));
		System.out.println("Enter the First Letter is Capital rest is in lower letter :::::");
		System.out.println(FirstCharacterOfEachStringUpperAndRestLower(s));;
		System.out.println("All Permutaion of Word :::::");
		System.out.println(PermutaionOfStringG(s));;
	}

}
