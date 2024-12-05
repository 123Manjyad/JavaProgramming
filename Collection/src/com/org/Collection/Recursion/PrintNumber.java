package com.org.Collection.Recursion;

import java.util.Scanner;

public class PrintNumber {
	
	public static int Recursion(int n)
	{
		if(n==11)
		{
			return 0;
		}
		System.out.print(n+" ");
		return Recursion(n+1);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number that you want to count from :::::");
		int n=sc.nextInt();
		Recursion(n);
		
	}

}
