package com.org.Collection.ExceptionHandling;

public class UnreachableException {
	public static void main(String[] args) {
		try {
			
			int[] arr= {41,45,0,12,23,0};
			System.out.println(arr[2]);
		
			System.out.println(arr[10]);
			
			try {
				System.out.println(arr[1]/arr[2]);
		      }
			catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Exception Arithmatic Exception");
				System.out.println(e.getMessage());
				System.out.println(e);
				System.err.println(e.getStackTrace());
				e.printStackTrace();
			
				
			}
			
		} 
		
	
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Exception Index Out of Bound");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.getStackTrace();
			e.printStackTrace();
			
		}
		
	
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception ");
			e.getStackTrace();
			
		}
		
	
		
	}

}
