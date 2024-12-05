package com.org.Programming.QuestionsBYShambhuSir;

import java.util.Scanner;

public class IsomorphicNumber {
	public static boolean Isomorphic(int n)
	{
		int rem=0,rem1=0;
		int square=n*n;
		while(n!=0)
		{
			rem=n%10;
			rem1=square%10;
			if(rem!=rem1)
			{
				return false;
			}
			n=n/10;
			square=square/10;
	    }
			
	return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter your Number please :::::   ");
		//int n=sc.nextInt();
		System.out.print("All the Number between 0 to 100 which is Automorphic :::::   ");
		int count=0;
		for(int i=0;i<100;i++)
		{
			boolean b=Isomorphic(i);
			if(b==true)
			{
				System.out.print(i+",");
				count++;
			}
		}
		System.out.println();
		
	    System.out.println("Total Number of Count from the loop is  :  "+count);
		
		
		
		
		sc.close();
	}

}
