package org.qsp.CollectionString;

import java.util.Scanner;

public class StringQues {
	public static void swap(Character c,Character c1)
	{
		Character temp=' ';
		 temp=c;
		 c=c1;
		 c1=temp;
		
	}
	public static String reverse(String str)
	{
		int i=0;
		int l=str.length();
		while(i<=l)
		{
			swap(str.charAt(i),str.charAt(l));
		}
	return str;
	}
	public static int sumNumbericCore(String str)
	{
		int sum=0;
		for(Character ch:str.toCharArray())
		{
			
			if(Character.isDigit(ch))
			{
				  if((ch-'0')%2==0)
				  {
					  sum+=ch-'0';
				  }
			}
		}
	return sum;}
	public static int sumNumberic(String str)
	{
		int sum=0;
		for(Character ch:str.toCharArray())
		{
			if(Character.isDigit(ch))
			{
				sum+=ch-'0';
			}
		}
	return sum;}
	public static String ReplaceWith(String str)
	{
		String str1=str.replace(' ', '_');
	
		return str1;
		
	}
	public static String ReplaceWithout(String str)
	{
		
		String str1="";
		for(Character  ch:str.toCharArray())
		{
			if(ch==' ')
			{
				str1+='_';
			}
			else
			{
				str1+=ch;
			}
		}
		return str1;
		
	}
	public static void SpaceIndex(String str)
	{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch==' ')
				{
					System.out.print(i+" ");
				}
				
			}
		return ;
		
	}
	public static void PrintIndex(String str)
	{
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(!Character.isDigit(ch))
				{
					System.out.print(i+" ");
				}
				
			}
		return ;
		
	}
	public static void FindCount (String n)
	{
		int Specialcount=0,digitCount=0,SpaceCount=0,digitc=0,lowerc=0,uperc=0;
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(!Character.isLetterOrDigit(ch))
			{
				Specialcount++;
			}
			if(Character.isDigit(ch))
			{
				digitCount++;
			}
			if(ch==' ')
			{
				SpaceCount++;
			}
			if(Character.isDigit(ch))
			{
				digitc++;
			}
			if(Character.isLowerCase(ch))
			{
				lowerc++;
			}
			if(Character.isUpperCase(ch))
			{
				uperc++;
			}
		}
		System.out.println("Special Character Number is :::::"+SpaceCount+"Number of Digit in the String is :::::"+SpaceCount+""+digitc+""+lowerc+""+uperc);
	return ;
	}
	public static int ExcludingSpecialCharacter(String n)
	{
		int count=0;
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(!Character.isLetterOrDigit(ch))
			{
				count++;
			}
			
		}
	return count;}
	public static int CountWithoutSpace(String n)
	{
		int count=0;
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(ch!=' ')
			{
				count++;
			}
			
		}
	return count;}
	public static int FindNumericLength(String n)
	{
		int count=0;
		for(int i=0;i<n.length();i++)
		{
			char ch=n.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
			
		}
	return count;}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String that you want to find out length :::::");
		String num=sc.nextLine();
		int len=0;
		for(Character ch:num.toCharArray())
		{
			len++;
		}
		
		System.out.println("Length of the String is :::::"+len);
		
		System.out.println("Count the Number of Numeric Digit in the String is :::::"+FindNumericLength(num));
		System.out.println("Count the Number of the Character without Space Count  :::::"+CountWithoutSpace(num));
		System.out.println("Count the Number of the Special Character from the String  :::::"+ExcludingSpecialCharacter(num));
	//	PrintIndex(num);
    //		SpaceIndex(num);
		System.out.println(ReplaceWithout(num));;
		String str=num.replace(' ', '_');
		System.out.println(str);
		System.out.println(ReplaceWith(num));
		System.out.println("Sum of the Digit of the Array is :::::"+sumNumberic(num));
		System.out.println("Number of Count n :::::"+sumNumbericCore(num));
		System.out.println(reverse(num));
	}

}
