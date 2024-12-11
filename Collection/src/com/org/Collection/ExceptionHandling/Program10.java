package com.org.Collection.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program10 extends Exception {
	public static void main(String[] args) {
		try {
			checkFile();
			System.out.println("File is found There  :::::");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Program Ends Here Please  :::::");
	}
	public static void checkFile() throws FileNotFoundException
	{
		FileInputStream fs=new FileInputStream("D:\\java10.txt");
		//throw new FileNotFoundException();
		
	}

}
