package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class MaxOfThree  {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number x");
		int x=sc.nextInt();
		System.out.println("Enter first Number y");
		int y=sc.nextInt();
		System.out.println("Enter first Number z");
		int z=sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println("Maximum No from x,y,z :"+x);
		}
		
		else if(y>x && y>x)
		{
			System.out.println("Maximum No from x,y,z :"+y);
		}
		else
		{
			System.out.println("Maximum No from x,y,z :"+z);
		}
		
		int max=(x>y)?(x>z?x:z):(y>z? y:z);
		System.out.println("Maximum no from x,y and z is : "+max);
	}

}
