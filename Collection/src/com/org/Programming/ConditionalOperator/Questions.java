package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class Questions {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   int count=0,temp=n,temp1=n,rem=0,sum=0;
		   
		   while(temp!=0)
		   {
			   temp=temp/10;
			   count++;
		   }
		   
		   while(temp1!=0)
		   {
			   rem=temp1%10;
			   sum+=(int)(Math.pow(rem,count--));
			   temp1=temp1/10;
		   }
		   if(sum==n)
		   {
			   System.out.println("DissariumNumber");
		   }
		   
		   sc.close();
	}

}
