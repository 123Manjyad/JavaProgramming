package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class Armstrong {
	
	
	public static int ArmstrongNumber(int n)
	{
		 
	      int temp=n;
	      int x=n;
	      int count=0,
	    		  sum=0;
	      int r=0;
	      while(n!=0)
	      {
	    	 
	    	  n=n/10;
	    	  count++;
	      }
	    //  System.out.println(count);
	      while(temp!=0)
	      {
	    	 
	    	  r=temp%10;
	    	  sum=(int) (sum+Math.pow(r, count));
	    	  temp=temp/10;
	    	//  System.out.println(r+" s"+sum+" temp"+ temp);
	      }
	      
	      if(sum==x)
	      {
	    	  return 1;
	      }
	   
	      
		
	return 0;}
	public static void main(String[] args) {
		      Scanner sc=new Scanner(System.in);
		   
		     
		      int count=0;
		      for(int i=1;i<=100;i++)
		      {
		    	 count=count+Armstrong.ArmstrongNumber(i);
		      }
		     
		      System.out.println("Total Number of Armstrong Number is "+count);
		    
	}

}
