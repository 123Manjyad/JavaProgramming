package com.org.Collection.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Serialization {
	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		Student s1=new Student(1452,"Manjeet Kumar","manjeet851401@gmail");
		Student s2=new Student(14542,"Manjeet Kumar Yadav","manjeetyadav851401@gmail");
		Student s3=new Student(14552,"Manjeet Kumar Prasad","manjeetprasad851401@gmail");
		Student s4=new Student(14452,"Manjeet Kumar AgnihotriBrahaman","manjeetagnihotribrahman851401@gmail");
		Student s5=new Student(14352,"Manjeet Kumar Rai","manjeetrai851401@gmail");
		Student s6=new Student(14252,"Manjeet Kumar Ray","manjeetray851401@gmail");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		try {
			FileOutputStream out=new FileOutputStream("D:\\person420.ser");
			
				ObjectOutputStream o=new ObjectOutputStream(out);
			  for(Student s:list)
			  {
				  o.writeObject(s);
			  }
				
			  System.out.println("Object is Created in the File");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
