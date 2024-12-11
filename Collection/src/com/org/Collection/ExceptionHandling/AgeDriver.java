package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class AgeDriver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:  ");
		int age=sc.nextInt();
		
		
		try {
			GaribHoTum.checkGaribi(age);
			
		} catch (CustomExceptionGarib e) {
			// TODO Auto-generated catch block
			System.out.println("This is catch Block and you are Garib");
			e.printStackTrace();
			System.out.println("Message is :"+e.getMessage());
			
		}
		System.out.println("Program ends Here Man :::::");
		
	}

}
