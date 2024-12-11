package com.org.Collection.ExceptionHandling;

import java.util.Scanner;

public class TestSkill {
	
	public static int Test(int x)
	{
		
		
		try {
			if(x>100)
			{
				 int m=x/0;
			}
		
			return 70;
		} catch (Exception e) {
			// TODO: handle exception
			return 700;
		}
		
	}
	public static int main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X Please Baby  ::::::");
		int x=sc.nextInt();
		Test(x);
		
	
	return 0; }

}
