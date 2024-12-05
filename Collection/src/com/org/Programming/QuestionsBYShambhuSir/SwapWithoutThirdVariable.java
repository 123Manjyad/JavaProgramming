package com.org.Programming.QuestionsBYShambhuSir;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two Number :::::::    ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    
	    System.out.println("Before Swapping :::::      ");
	    System.out.println(a+" "+b);
//	    a=a+b-a;
//	    b=a+b-a;
	    
	    //Division
	    a=a*b/a;
	    b=a*b/b;
	    System.out.println("After Swapping :::::      ");
	    System.out.println(a+" "+b);
	}

}
