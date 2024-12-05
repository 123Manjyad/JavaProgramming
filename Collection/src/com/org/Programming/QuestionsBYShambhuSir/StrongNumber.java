package com.org.Programming.QuestionsBYShambhuSir;

import java.util.Scanner;

public class StrongNumber {
	
	public static int  factorial(int n)
	{
		
		if(n==1)
		{
			return 1;
		}
		return factorial(n-1)*n;
	}
  public static void main(String[] args) {
	  
//	  Scanner sc=new Scanner(System.in);
//	  System.out.println("Enter your Input please");
	  for(int i=0;i<100;i++)
	  {

	  int temp=i;
	  int rem=0,sum=0;
	  while(i!=0)
	  {
		  rem=i%10;
		 sum+=factorial(rem);
		 System.out.println(sum);
		 i=i/10;
	  }
	
   }
	
}
}
