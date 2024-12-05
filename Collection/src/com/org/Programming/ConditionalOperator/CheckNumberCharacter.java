package com.org.Programming.ConditionalOperator;

import java.util.Scanner;

public class CheckNumberCharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*	System.out.println("Enter the Character to check ::");
		Character ch=sc.next().charAt(0);
		System.out.println(Character.isLowerCase(ch));
		if(Character.isLetter(ch))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	
		int x = 10;
		int y = 5;
		int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);

		System.out.println(z);
		
		int a = 5;
		int b = 10;
	
		
		int c=a-- + ++b- b-- + ++a;
		//int result = (x < y) ? (y < z) ? z : y : x;
		System.out.println(c);
		
		int x=12;
		x=x++;
		x=x++;
		x=x++;
		x=++x;
		x=x++;
		System.out.println(x);
		*/
		
		int a=8;
		int b=12;
		int c= ++a +b++;
		c--;
		--b;
		int d= c-- + ++b + ++a;
		int e= a + ++b +c + d++;
		System.out.println (++e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
