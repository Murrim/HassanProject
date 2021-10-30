package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Difference {
	
	public static void main(String[] args) {
		
		/**
		 * Here we will talk about the difference between three main interfaces of collection
		 * (List , Set , Queue)
		 * 
		 *  1- List:
		 *     i)- it allows duplicate values.
		 *     ii)- it preserved the insertion order
		 *     
		 *  2- Set :
		 *   i)- It does not allow the duplicate values.
		 *   ii)- It does not preserve the insertion order.
		 */
		
		
        ArrayList<String> list = new ArrayList<String>();
		
		list.add("Muhammad Hassan Khan");
		list.add("Muhammad Hassan Khan");
		
		for (Object object : list) {
			System.out.println(object);
		}
		
       ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("A");
		list1.add("B");
		list1.add("C");
		for (Object object : list1) {
			System.out.println(object);
		}
		
		/*
		 * We  saw that ArrayList is a part of List so it is allowing duplicate values and also preserving the insertion
		 * order of values.
		 */
		
		System.out.println("=====================");
		
      Set<String> set = new HashSet<String>();
		
		set.add("My name is Hassan Khan");
		set.add("My name is Hassan Khan");
		
		
		for (String string : set) {
			System.out.println(string);
		}
		
		System.out.println("=====================");
		
	      Set<String> set1 = new HashSet<String>();
			
			set1.add("A1");
			set1.add("A2");
			set1.add("A3");
			
			for (String string : set1) {
				System.out.println(string);
			}


			/*
			 * We  saw that HashSet is a part of Set so it is not allowing duplicate values and also not preserving the insertion
			 * order of values.
			 */
		
		
		
	}

}
