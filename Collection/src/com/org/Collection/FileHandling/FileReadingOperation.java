package com.org.Collection.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingOperation {
	public static void main(String[] args) {
		
		File f2=new File("D:\\java11.txt");
		
		try {
		
			  if (f2.createNewFile()) {
	                System.out.println("File is created successfully.");
	            } else {
	                System.out.println("File already exists.");
	            }
			
			FileOutputStream fos=new FileOutputStream(f2);
			fos.write("Manjeet".getBytes());
			fos.close();
			
			FileReader fr=new FileReader(f2);
			int x=fr.read();
			
			while(x!=-1)
			{
				System.out.print((char)x);
				x=fr.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
