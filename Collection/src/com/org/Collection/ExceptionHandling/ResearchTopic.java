package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class ResearchTopic {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		try {
			
			int x=sc.nextInt();
			
			int m=78/x;
			System.out.println(m);
			
		} finally  {
			System.out.println("I love You Shobha :::::");
			sc.close();
			// TODO: handle exception
		}
		
	}


}
