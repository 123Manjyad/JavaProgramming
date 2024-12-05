package org.qsp.CollectionString;

import java.util.Scanner;


public class QuestionsOnStringPartII {
	public static void WithoutSplit(String str)
	{
		    String str1="";
		   for(int i=0;i<str.length();i++)
		   {
			   Character ch=str.charAt(i);
			   if(str.charAt(i)!=' ')
			   {
				   str1+=str.charAt(i);
			   }
			   else
			   {
				   System.out.println(str1);
				   str1="";
			   }
			 
		   }
		   if (str1.length() > 0) {
		        System.out.println(str1);
		    }
	}
	public static void  RemoveDuplilcate(String str)
	{
		
		boolean[] arr=new boolean[256];
		
		StringBuilder str1=new StringBuilder();
		
	   for(int i=0;i<str.length();i++)
	   {
		   Character ch1=str.charAt(i);
		   if(!arr[ch1])
		   {
			   arr[ch1]=true;
			   str1.append(ch1);
		   }
	   }
	  
	  System.out.println(str1);
	  return;
	}
	
	public static boolean Palindrome(String str)
	{
		int i=0;
		int l=str.length()-1;
		while(i<=l)
		{
			if(str.charAt(i)!=(str.charAt(l)))
			{
				return false;
			}
			i++;
			l--;
		}
	return true;}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to Find Palindrome or not Please :::::");
	  	String str=sc.nextLine();
		WithoutSplit(str);
	//sSystem.out.println(Palindrome(str));
//	//	RemoveDuplilcate(str);
//		WithoutSplit(str);
		
	}

}
