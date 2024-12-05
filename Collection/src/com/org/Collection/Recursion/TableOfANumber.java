package com.org.Collection.Recursion;

import java.util.Scanner;

public class TableOfANumber {

	
		
		public static void Recursion(int n,int multiplier)
		{
			if(multiplier>10)
			{
				return ;
			}
		
		  System.out.println(n*multiplier);
		  Recursion(n,multiplier+1);
		}
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your Number that you want to count from :::::");
			int n=sc.nextInt();
			
			Recursion(n,1);
		
		}

	}


