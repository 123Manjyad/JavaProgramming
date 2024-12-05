package com.org.Collection.UtilityPackage;

import java.util.Arrays;

public class UtilityClass {
	public static void main(String[] args) {
		
		int[] arr= {12,34,46,65,663,22,34};
		System.out.println(arr);
		System.out.println("Arrays are these Array : :");
		System.out.println(Arrays.toString(arr));
	     
		Arrays.sort(arr);
		System.out.println("Sorted Arrays : :");
		System.out.println(Arrays.toString(arr));
	
		
	}

}
