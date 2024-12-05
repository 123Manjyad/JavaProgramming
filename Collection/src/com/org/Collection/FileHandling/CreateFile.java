package com.org.Collection.FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File f1=new File("D:\\java10.txt");
		
		try {
			f1.createNewFile();
			System.out.println("File is Created Successful");
			
			FileOutputStream fos=new FileOutputStream(f1);
			//FileWriter fw=new FileWriter(f1);
			char[] a= {'q','w'};
			String  c="Manjeet Yadav";
			//fw.write(c);
//			fw.write(a, 1, 1);
//			fw.close();
			fos.write(c.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			System.out.println("File is not Created");
			System.out.println(e.getMessage());
		}
		
	}

}
