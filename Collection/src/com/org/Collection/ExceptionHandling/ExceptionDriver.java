package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class ExceptionDriver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Choice to add the Value of X :::::");
		int x=sc.nextInt();
		
		
		
		try {
			GaribHoTum.checkGaribi(x);
		} 
		
		catch (CustomExceptionGarib e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());;
		}
	}

}
