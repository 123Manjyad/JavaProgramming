package com.org.Collection.Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserilization {
	public static void main(String[] args) {
		
		
		try {
			FileInputStream fileIn=new FileInputStream("D:\\person420.ser");
			ObjectInputStream In=new ObjectInputStream(fileIn);
			
			while(true)
			{
				try {
					Student s=(Student)In.readObject();
					System.err.println("x__________X_______________X________________X_____________X");
					System.out.println(s);
				}
					catch (EOFException e) {
	                    // End of file reached, break the loop
	                    break;
					}
					
					catch (ClassNotFoundException e) {
	                    e.printStackTrace();
	                }
					
		 catch (Exception e) {
					// TODO: handle exception
				}
			
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
