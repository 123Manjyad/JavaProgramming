package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First Number  :::::");
		int x=sc.nextInt();
		
		System.out.println("Enter your Second Number  :::::");
		int y=sc.nextInt();
		
		try {
			Operate.getResult(x, y);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("==========");
			e.printStackTrace();
			System.out.println("===========");
		}
		finally {
			sc.close();
			System.out.println("Finally Block is Excuted  :::::");
			System.out.println(10/0);
			System.out.println("Finally Block ends from Here  :::::");
		}
		
		System.out.println("program ends here G  :::::");
	}

}
