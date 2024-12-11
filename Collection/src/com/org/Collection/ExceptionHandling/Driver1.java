package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your First Number  :::::");
		int x=sc.nextInt();
		
		System.out.println("Enter Your Second Number  :::::");
		int y=sc.nextInt();
		
		Operate.getResult(x, y);
		System.exit(0);
		
	}

}
