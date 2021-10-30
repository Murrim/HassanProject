package com.collection;

import java.util.LinkedList;

public class Link {
	
	/*
	 * Now we will use LinkedList class of interface list , It works exactly same as ArrayList but still have
	 * some differences that we will discuss in future classess.
	 */
	
	public static void main(String[] args) {
		
		// Homogeneous
		
		LinkedList link = new LinkedList();
		
		link.add("Hassan Khan");
		link.add(25);
		link.add(6.1);
		
		for ( Object object : link) {
			System.out.println(object);
		}
		
		System.out.println("=====================");
		
		
		// Heterogeneous
		
		
		LinkedList<String> link1 = new LinkedList<String>();
		 
		link1.add("how are you?");
		
		for (String string : link1) {
			System.out.println(string);
		}
		
	}
	
	
	
	
	
	   

}
