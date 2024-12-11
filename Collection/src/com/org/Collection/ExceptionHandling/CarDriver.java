package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class CarDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Car Name please  :::::");
		
		String name=sc.nextLine();
		Car c=new Car(name);
		c=null;
		c.getName();
		
	}

}
