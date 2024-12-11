package com.org.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRelatedQuestionDo {
	public static void RotateArray(String[] arr)
	{
		int n=arr.length;
		String temp=arr[0];

		for(int i=0;i<n-1;i++)
		{
		   arr[i]=arr[(i+1)];
		}
		
        arr[n-1]=temp;
	    for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.print(arr[i]+" ");
	     }
	
	}
	public static void RemoveAtPosition(String[] arr,int position)
	{
		System.out.println("Enter Input that you want to insert :::::");
     
	     arr[position-1]=null;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.print(arr[i]+" ");
	     }

	}
	public static void InsertAtPosition(String[] arr,int position)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input that you want to insert :::::");
         String str=sc.nextLine();
	     arr[position-1]=str;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.print(arr[i]+" ");
	     }

	}
	public static void StringArray(String[] strarr)
	{
		for(int i=0;i<strarr.length;i++)
		{
			if(strarr[i].length()%2==0)
			{
				System.out.println(strarr[i]);
			}
		}
	}
	public static int EvenCount(int[]  arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
	return count;
	}
	public static void EvenElement(int[]  arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void EvenIndex(int[]  arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Input in the Array you willing to take :::::");
		int n=sc.nextInt();
		sc.nextLine();
       
		/*
//		 * 	'int[] arr=new int[n];
//		System.out.println("Enter the Number that you want to make input  :::::");
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//		
//		System.out.println("Element with Even Index :::::");
//	    EvenIndex(arr);
//	    System.out.println("Element with Even Number :::::");
//	    EvenElement(arr);
//	    System.out.println("Number of Even Element in the Array :::::"+ EvenCount(arr));;
//	    */
	    ArrayList<Integer> arr1=new ArrayList<>();
	    String[] a=new String[n];
		System.out.println("Enter the Number that you want to make input  :::::");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();
		}
//		System.out.println("Enter the Position where you want to add  :::::");
//		int x=sc.nextInt();
	 //   StringArray(a);
	  //  InsertAtPosition(a,x);
		//RemoveAtPosition(a,x);
		RotateArray(a);
	}

}
