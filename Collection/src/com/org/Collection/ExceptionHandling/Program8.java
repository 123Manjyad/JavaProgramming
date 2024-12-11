package com.org.Collection.ExceptionHandling;

public class Program8 {
	public static void main(String[] args) {
		System.out.println("Main starts from Here  :::::");
		int i=1;
       while(i<=10)
       {
    	   System.out.println("i is "+i);
    	   
    	   try {
    		   
			Thread.sleep(14523);
			
			   i++;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   
    	
       }
       
       System.out.println("Main ends here bro  :::::");
	}

}
