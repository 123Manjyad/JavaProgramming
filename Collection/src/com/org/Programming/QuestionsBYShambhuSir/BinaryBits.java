package com.org.Programming.QuestionsBYShambhuSir;

import java.util.Scanner;

public class BinaryBits {
	public static String Binary(int m)
	{
		
		String str="";
		int rem=0;
		while(m!=0)
		{
			rem=m%2;
			//str+=(rem);
			str=rem+str;
			m=m/2;
		}
		
		return str;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
	
		int m=sc.nextInt();
	    String s=Binary(m);
		System.out.println(s);
	    int m1=(int)(Binary(m).length());
//	      x=Integer.parseInt(Binary(m),2);
		int one=0,two=0;
	     for(int i=0;i<m1;i++)
	     {
	    	 if(s.charAt(i)=='1')
	    	 {
	    	      one=one+1;
	    	 }
	    	 else if(s.charAt(i)=='0')
	    	 {
	    	     two=two+1;
	    		
	    	 }
	     }
      System.out.println("Number of One in binary number is  :::::"+one);
      System.out.println("Number of One in binary number is  :::::"+two);
		
		sc.close();
		
	}

}
