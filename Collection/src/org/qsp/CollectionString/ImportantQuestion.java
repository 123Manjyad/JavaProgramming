package org.qsp.CollectionString;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ImportantQuestion {
	public static void FreqStringMaximum(String str)
	{
		Map<String,Integer> mpp=new HashMap<String,Integer>();
		String s="";
		int count=0;
		int n=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{	
			     mpp.put(s, mpp.getOrDefault(s,0)+1);
				 s="";
				
			}
		}
		String sm="";
		mpp.put(s, mpp.getOrDefault(s,0)+1);
		for(Map.Entry<String, Integer> ent:mpp.entrySet())
		{
			if(ent.getValue()>count)
			{
				count=ent.getValue();
				sm=ent.getKey();
				
			}
		
		}
	System.out.println("Maximum time occured word is      :::::"+sm);
	}
	public static void FreqStringDuplicate(String str)
	{
		Map<String,Integer> mpp=new HashMap<String,Integer>();
		String s="";
		int count=0;
		int n=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{	
			     mpp.put(s, mpp.getOrDefault(s,0)+1);
				 s="";
				
			}
		}
		mpp.put(s, mpp.getOrDefault(s,0)+1);
		for(Map.Entry<String, Integer> ent:mpp.entrySet())
		{
			if(ent.getValue()>1)
			{
				System.err.println("Key Character "+ent.getKey()+" their values "+ent.getValue());
				count++;
			}
		
		}
	System.out.println("Number of Uniqe word is      :::::"+count);
	}
	public static void PrintFirstLetter(String str)
	{
		
		String s="";
		int n=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{	
				 System.out.println("First Character of Word "+s+" is "+s.charAt(0));
				 s="";
				
			}
		}
		System.out.println("First Character of Word "+s+" is "+s.charAt(0));
	
	
	}
	public static void FreqString(String str)
	{
		Map<String,Integer> mpp=new HashMap<String,Integer>();
		String s="";
		int count=0;
		int n=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{	
			     mpp.put(s, mpp.getOrDefault(s,0)+1);
				 s="";
				
			}
		}
		  mpp.put(s, mpp.getOrDefault(s,0)+1);
		for(Map.Entry<String, Integer> ent:mpp.entrySet())
		{
			if(ent.getValue()==1)
			{
				System.err.println("Key Character "+ent.getKey()+" their values "+ent.getValue());
				count++;
			}
		
		}
	System.out.println("Number of Uniqe word is      :::::"+count);
	}
	public static int findMissing(String str,int n)
	{
		int sum=0;
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i]-'0';
		}
		
		return n*(n+1)/2-sum;
		
	}
	public static void freq3(String str)
	{
		Character c=' ';
	HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(ch!=' ')
			{
				mp.put(ch, mp.getOrDefault(ch, 0)+1);
				
			}
		
		       
		}
        for(Map.Entry<Character,Integer> ent: mp.entrySet())
        {
        	

        	if(ent.getValue()>count)
        	{
        		count=ent.getValue();
        	    c=ent.getKey();
        	
        	}
        
        }
        System.out.println("Key which Maxumum Number of time is this  :::::::::::"+c+" This much time  "+count);

	}
	public static void freq2(String str)
	{
		Character c=' ';
	HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(ch!=' ')
			{
				mp.put(ch, mp.getOrDefault(ch, 0)+1);
				
			}
		       
		}
        for(Map.Entry<Character,Integer> ent: mp.entrySet())
        {
        	

        	if(ent.getValue()>count)
        	{
        		count=ent.getValue();
        	    c=ent.getKey();
        	
        	}
        
        }
        System.out.println("Key which Maxumum Number of time is this  :::::::::::"+c+" This much time  "+count);

	}
	public static void Frequency1(String str)
	{
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(ch!=' ')
			{
				mp.put(ch, mp.getOrDefault(ch, 0)+1);	
			}
		       
		}
        for(Map.Entry<Character,Integer> ent: mp.entrySet())
        {
        	if(ent.getValue()==1)
        	{
        		System.err.println("Key Character "+ent.getKey());
        	}
        
        }
	   }
	public static void Frequency(String str)
	{
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			Character ch=str.charAt(i);
			if(ch!=' ')
			{
				mp.put(ch, mp.getOrDefault(ch, 0)+1);
				
			}
		       
		}
        for(Map.Entry<Character,Integer> ent: mp.entrySet())
        {
        	System.err.println("Key Character "+ent.getKey()+" their values "+ent.getValue());
        }
	   }
	public static boolean StringContainsOnlyDigit(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
		   if(!Character.isDigit(str.charAt(i)))
				   {
			                return false;
				   }
		}
        return true;
	   }
	
	public static void converttoLower(String str)
	{
		StringBuilder s=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			s.append(Character.toUpperCase(str.charAt(i)));
		}
		String m=s.toString().trim();
		System.out.println(m);
	}
	public static void convert(String str)
	{

		String[] words=str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String s:words)
		{
			if(s.length()>0)
			{
				result.append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).append(" ");
			}
		}
		System.out.println("helo");
		String output = result.toString().trim();
		System.out.println(output);
	}
	public static String Largest(String str)
	{
		String s="",str1="";
		int n=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{	
				//System.out.println(s);
				if(s.length()>str1.length())
				{
					str1=s;
				}
				s="";
				
			}
		}
		if(s.length()>str1.length())
		{
			str1=s;
		}
	return str1;
	}
	public static int CountString(String str)
	{
		String s="";
		int n=str.length()-1,count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{		
				if(s.length()%2==0)
				{
					System.out.println(s);
					count++;
				}
				s="";
				
			}
		}
	return count;
	}
	
	public static String ReverseAnother(String str)
	{

		Stack<String> st=new Stack<>();
	
		String s="";
		int n=str.length()-1;
		for(int i=n;i>=0;i--)
		{
			
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{
				st.push(s);
				s="";
			}
		}
		st.push(s);
		String sm="";
		for(String p:st)
		{
			 p+=" "+sm;
			 sm=p;
		
			 
		}

	return sm;
	}
	public static String Reverse(String str)
	{
		Stack<String> st=new Stack<>();
		String s="";
		for(int i=0;i<str.length();i++)
		{
			
			if(str.charAt(i)!=' ')
			{
				s+=str.charAt(i);
			}
			else
			{
				st.push(s);
				s="";
			}
		}
		st.push(s);
		String sm="";
		for(String p:st)
		{
			 p+=" "+sm;
			 sm=p;
		
			 
		}

	return sm;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String that you want to chagne  :::::");
		String str=sc.nextLine();
		System.out.println("Enter the Number that you want to pass  :::::");
		int n=sc.nextInt();
		/*System.out.println("This is the Reverse of that Statement you are Written Above :::::");
		System.out.println(Reverse(str));;
		System.out.println("This the Another Reverse of Word in a Sentence :::::");
		System.out.println(ReverseAnother(str));
		System.out.println("Enter the input please :::::");
		System.out.println(CountString(str)); */
		
		//System.out.println("Largest string :::::");
		//System.out.println(Largest(str));
		//convert(str);
		//converttoLower(str);
		//System.out.println(StringContainsOnlyDigit(str)); ;
		
		//Frequency(str);
		//Frequency1(str);
		//freq2(str);
		//freq2(str);
		//System.out.println(findMissing(str,n));;
		//FreqString(str);
		// PrintFirstLetter(str);
		//FreqString(str);
		//FreqStringDuplicate(str);
		FreqStringMaximum(str);
		
		
		
	}

}
