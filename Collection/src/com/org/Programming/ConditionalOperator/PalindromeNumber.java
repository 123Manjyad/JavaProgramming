package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static boolean palindrome(int x)
	{
		int temp=x;
		int rem=0,num=0;
		while(x!=0)
		{
			 rem=x%10;
			num=num*10+rem;
		
			x=x/10;
		}
		
		if(temp==num)
		{
			System.out.println("Number is Palindrome "+num);
			return true;
		}
	
	return false;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number you want to check the this number is palindrome or not ::");
		int m=sc.nextInt();
		
		boolean b=PalindromeNumber.palindrome(m);
		
		System.out.println(b);
		
	}

}
