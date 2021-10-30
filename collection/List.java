package com.collection;

import java.util.ArrayList;

public class List {
	
	/*
	 * Here we will learn to use list interface of collection.
	 */
	
	public static void main(String[] args) {
		
	/*
	 * Here we used ArrayList class form interface list and stored heterogeneous data inside the class which
	 * means we can store string , int , double all types of values under same class.
	 * 
	 */
		
		ArrayList list = new ArrayList();
		
		list.add("Muhammad Hassan Khan");
		list.add(25);
		list.add("Height " + " = " + 6.1);
		
		for (Object object : list) {
			System.out.println(object);
		}
		
		
		
		System.out.println("=====================");
		
		/*
		 * Here we used ArrayList to store homogeneous data by declaring string variable and used foreach loop
		 * to call out values.
		 */
		
		ArrayList <String> listt = new ArrayList <String> ();
		
		listt.add("Hello");
		listt.add("How are you ?");
		
		for (String st : listt) {
			System.out.println(st);
		}
		
		System.out.println("=====================");
		
        ArrayList <Integer> listtt = new ArrayList <Integer> ();
		
		listtt.add(25);
		listtt.add(6);
		
		for (int nu : listtt) {
			System.out.println(nu);
		}
		
		System.out.println("=====================");
		
        ArrayList <Double> listttt = new ArrayList <Double> ();
		
		listttt.add(25.0);
		listttt.add(6.1);
		
		for (double db : listttt) {
			System.out.println(db);
		}
		
		System.out.println("=====================");

		ArrayList array = new ArrayList();
		
		array.add("Muhammad Hassan Khan");
		array.add(25);
		array.add("Height " + " = " + 6.1);
		
		System.out.println(array);
		
		/*
		 * Instead of using we can directly sysout to call out values, this is another feature of collection
		 * that does not come with array.
		 */
		
	}

}
