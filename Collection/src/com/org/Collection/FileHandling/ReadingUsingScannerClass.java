package com.org.Collection.FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingUsingScannerClass {
	public static void main(String[] args) {
        File f2=new File("D:\\java11.txt");
		
	try {
	
		  if (f2.createNewFile()) {
                System.out.println("File is created successfully.");
            } else {
                System.out.println("File already exists.");
            }
		
		  Scanner sc=new Scanner(f2);
	 //   FileInputStream fis=new FileInputStream(f2);
//		fos.write("Manjeet".getBytes());
//		fos.close();
		
	//	FileReader fr=new FileReader(f2);
		  while(sc.hasNext())
		  {
			  System.out.println(sc.nextLine());
		  }
//		int x=sc.read();
//		
//		while(x!=-1)
//		{
//			System.out.print((char)x);
//			x=fis.read();
//		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
