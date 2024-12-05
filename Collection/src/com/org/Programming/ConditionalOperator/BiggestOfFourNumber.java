package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class BiggestOfFourNumber {
	public static void main(String[] args) {
		

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first Number x");
	int x=sc.nextInt();
	System.out.println("Enter first Number y");
	int y=sc.nextInt();
	System.out.println("Enter first Number z");
	int z=sc.nextInt();
	System.out.println("Enter first Number k");
	int k=sc.nextInt();
	
	if(x>y && x>z && x>k)
	{
		System.out.println("Maximum No from x,y,z,k :"+x);
	}
	
	else if(y>x && y>x  && y>k)
	{
		System.out.println("Maximum No from x,y,z,k :"+y);
	}
	else if(z>x && z>x  && z>k)
	{
		System.out.println("Maximum No from x,y,z,k :"+z);
	}
	else
	{
		System.out.println("Maximum No from x,y,z,k :"+k);
	}
	
	}
	
	

}
