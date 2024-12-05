package com.org.Collection.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
public class FileOutPutStreams {
	public static void main(String[] args) {
		File f1=new File("D:\\java8.txt");
	
		try {
			
			FileOutPutStreams fs=new FileOutPutStreams();
			
		 f1.createNewFile();
			
		     FileOutputStream fos=new FileOutputStream(f1);
		      String s="Manjeet Yadav";
	            fos.write(s.getBytes());
	            fos.close(); // Always close the writer to release resources
	            
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
		
		
		
	}

}
