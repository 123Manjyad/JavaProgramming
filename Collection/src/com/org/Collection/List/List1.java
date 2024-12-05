package com.org.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		
		List li=new ArrayList();
		li.add("Shohha");
		li.add("Pragya");
		li.add("P");
		li.add(789);
		li.add('G');
		li.add('M');
		li.add(789788);
		li.add("MUli Khaogi ");
		li.add("Wifely");
		
		li.add(789);
		li.add(789);
		li.add(789);
		li.add(789);
		li.add("null");
		li.add("NULL");
		li.add("null");
		li.add("NULL");
		li.add("Aur Kismat kharab ki Shobha ko Chorna Hoga");
		li.add(17,"I love you shobha G ");
		li.add(19,"Mujhe Afsos rhega tumhe na pane ki");
		li.add(20,"Mujhe Afsos rhega tumhe na pane ki");
		li.add(4,li);
		li.remove(10);
		Object ob=li.get(18);
		System.out.println(ob);
		
		System.err.println(li);
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		Object b=li.indexOf("I love you shobha G ");
		System.out.println(b);
		Object b1=li.lastIndexOf(789);
		System.out.println(b1);
	}

	
	
	

}
