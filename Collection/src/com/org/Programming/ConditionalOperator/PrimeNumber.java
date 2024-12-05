package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isprime(int n)
	{
		
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
	return true;
	}
	
	public static int sumdigit(int n)
	{
		int count=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			count+=rem;
		}
	return count;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Rannge num1 and num2 ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int count=0;
		for(int i=num1;i<=num2;i++)
		{
			boolean b=PrimeNumber.isprime(i);
			if(b==true)
			{
				count++;
				int m=PrimeNumber.sumdigit(i);
				boolean b1=PrimeNumber.isprime(m);
				if(b1==true)
				{
					System.err.println(i);
				}
			
			}
		
		
		
		}
		
		System.out.println("Total number of prime Number which digit is also prime is  betwwen Range num1 and num2 :   "  +count);

		
	}

}
