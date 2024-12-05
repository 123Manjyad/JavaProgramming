package com.org.Collection.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFileMan {
	public static void main(String[] args) {
		  File f1 = new File("D:\\java2.txt");
	        
	        try {
	            // Attempt to create the file if it doesn't exist
	            if (f1.createNewFile()) {
	                System.out.println("File is created successfully.");
	            } else {
	                System.out.println("File already exists.");
	            }
	            
	            // Create FileWriter and write a character
	          //  FileWriter fw = new FileWriter(f1);
	            FileOutputStream fos=new FileOutputStream(f1);
	            char c = 'M';
	            fos.write(c);
	            fos.close(); // Always close the writer to release resources
	            
	        } catch (IOException e) {
	            // Handle potential IOExceptions
	            System.out.println("An error occurred: " + e.getMessage());
	        }
	 

	}

}
