package com.org.Collection.ExceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;

public class Program4 {
	public static void main(String[] args) {
		ArrayList<Integer>  arr=new ArrayList<Integer>();
		
		arr.add(78);
		arr.add(1452);
		arr.add(47);
		arr.add(8);
		arr.add(8);
		arr.add(47);
		arr.add(47);
		arr.add(47);
		arr.add(47);
		arr.add(47);
		arr.add(47);
		arr.add(47);
		arr.add(47);

   //It does not work properly because when one element is remove the value is shifted by one index but the loop does
	//	not start from one previous point thats'why it skip one element each time it remove
//		for(int i=0;i<arr.size();i++)
//		{
//			if(arr.get(i)%2==1)
//			{
//				arr.remove(i);
//			}
//		}
		//ConcurrentModificationException
//		for(Integer i:arr)
//		{
//			if(i%2==0)
//			{
//				arr.remove(i);
//			}
//		}
		
		Iterator<Integer> itr=arr.iterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			if(x%2==0)
			{
				itr.remove();
			}
			
		}
		System.out.println("ArrayList is G Ho"+arr);
				
 	}

}
