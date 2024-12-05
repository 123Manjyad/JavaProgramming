package com.org.Programming.QuestionsBYShambhuSir;

public class Perfect {
	public static void main(String[] args) {
	
		  int x=78;
		  int tem=x;
		int sum=0,rem=0;
		while(tem!=0)
		{
			 rem=tem%10;
			sum=sum+rem;
	
		}
		System.out.println("enter");
		if(x==sum)
		{
		   System.out.println("Number is perfect from this side  :::::");
		}

	}

}
