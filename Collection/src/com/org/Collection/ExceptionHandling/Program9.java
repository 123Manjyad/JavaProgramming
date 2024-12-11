package com.org.Collection.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program9 {
	public static void main(String[] args) {
		try {
			
			
			FileInputStream fs=new FileInputStream("D:\\java10.txt");
			System.out.println("File Is Found  :::::");
		   
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends  :::::");
		
	}

}
