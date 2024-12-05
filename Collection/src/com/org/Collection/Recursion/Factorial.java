package com.org.Collection.Recursion;

import java.util.Scanner;

public class Factorial {
	  public static int FebonnaciSeries(int n)
	  {
		  if(n<=1)
		  {
			  return n;
		  }
		
		 return FebonnaciSeries(n-1)+FebonnaciSeries(n-2);
	  }
	  public static int FebonnaciSeriesSum(int n)
	  {
		  if(n<=1)
		  {
			  return n;
		  }
		
		 return FebonnaciSeriesSum(n-1)+FebonnaciSeriesSum(n-2)+1;
	  }
	  
	  
	  public static int Hcf(int big,int small,int count)
	  {
		  int m=big%count;
		  int n=small%count;
		  
		  if(m==0 && n==0)
		  {
			  return count;
		  }
		System.out.println(big+" "+small+" "+count);
		  return Hcf(big,small,count-1);
	  }
  public static int Lcm(int big,int small,int multiplier)
  {
	  int m=big%small;
	  
	  if(m==0)
	  {
		  return big;
	  }
	
	  return Lcm(big*multiplier,small,multiplier+1);
  }
  

	public static int Fibonnaci(int n,int a,int b)
	{
		if(n==1)
		{
			return 0;
		}
		if(n==2)
		{
			return 1;
		}
		return Fibonnaci(n-1,b,a+b);
	}
	  public static int fibonaccihelper(int n) {
	        return Fibonnaci(n, 0, 1);  // Initial call with F(1) = 0, F(2) = 1
	    }
	public static int biggest(int a,int b)
	{
		return a>b?a:b;
	}
	public static int smallest(int a,int b)
	{
		return a<b?a:b;
	}
	public static boolean  Palindrome(int n,int sum,int original)
	{
	  
		if(n==0)
		{

			  return sum==original;
		}
		
		return Palindrome(n / 10, sum* 10 + n % 10, original);
	}
	public static int ReverseNumber(int n,int num)
	{
	
		if(n==0)
		{
		
			return num;
		}
		int  rem=n%10;
	    
	   
		return ReverseNumber(n/10,num*10+rem);
	}
	public static int DigitSum(int n,int sum)
	{
		int  rem=0;
		if(n==0)
		{
		
			return sum;
		}
		rem=n%10;
		return DigitCount(n/10,sum+rem);
	}
	public static int DigitCount(int n,int count)
	{
		
		if(n==0)
		{
			return count;
		}
		return DigitCount(n/10,count+1);
	}
	public static int power(int x,int y)
	{
		if(y==1)
		{
			return x;
		}
	
		return x*power(x,y-1);
	}
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	/*.out.println("Enter the number that you want to do power :::::");
		int x=sc.nextInt();
		
		System.out.println("Enter How much time do you want please :::::");
		int y=sc.nextInt();
		//System.out.println(fact(x));;
		System.out.println("Power of a Two Input is as Below ::::::");
		System.out.println(power(x,y));

		System.out.println("Enter How much time do you want please :::::");
		int y=sc.nextInt();
		int count=0;
		System.out.println(DigitCount(y,count));
		

		System.out.println("Enter How much time do you want please :::::");
		int y=sc.nextInt();
		int sum=0;
		System.out.println("Digit sum of the Number Y is :::::");
		System.out.println(DigitSum(y, sum)); 
		
		System.out.println("Enter the Number that you want to REverse :::::");
		int y=sc.nextInt();
		int sum=0;
		System.out.println("Reverse Number is this please Display it Bro");
		int sum1=ReverseNumber(y, sum);
		System.out.println("Check Wether this number is Palindrome or Not :::::");
		System.out.println(Palindrome(y,sum,y));
		System.out.println("Enter the First Number :::::");
		int x=sc.nextInt();
		System.out.println("Enter the Second Number ");
		int y=sc.nextInt();
		System.out.println("Enter the Third Number:::::");
		int z=sc.nextInt();
		System.out.println("Enter theFourth Number:::::");
		int k=sc.nextInt();
		System.out.println("Biggest Number Among them is  ::::::"+" ");
        System.out.println(biggest(k,biggest(z,biggest(x,y)))); 
		
		System.out.println("Enter the Number that you want to REverse :::::");
		int y=sc.nextInt();
		
		System.out.println(fibonaccihelper(y)); */
		
		System.out.println("Enter the Number num1 :::::");
		int x=sc.nextInt();
//		System.out.println("Enter the Number num2 :::::");
//		int y=sc.nextInt();
//		System.out.println("Enter the Number num3 :::::");
//		int k=sc.nextInt();
		;
	  //  System.out.println(Lcm(biggest(k,Lcm(biggest(x,y),smallest(x,y),2)),smallest(k,Lcm(biggest(x,y),smallest(x,y),2)),2));
	 // System.out.println(Hcf(biggest(x,y),smallest(x,y),smallest(x,y)));
		
		System.out.println(FebonnaciSeries(x));;
		System.out.println(FebonnaciSeriesSum(x));
		 
	}

}
