package com.org.Collection.Recursion;

import java.util.Scanner;

public class Sum {
	public static int rec(int n)
	{
		if(n>100)
		{
			return 0;
		}
	
		return n*n+rec(n+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number please :::::");
		int s=sc.nextInt();
		System.out.println(rec(s));;
		
	}

}
