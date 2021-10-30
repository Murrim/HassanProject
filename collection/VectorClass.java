package com.collection;

import java.util.Vector;

public class VectorClass {
	
	/*
	 * Now we will use Vector  class of interface list , It works exactly same as ArrayList and LinkedList but still have
	 * some differences that we will discuss in future classess.
	 * 
	 * Vector is also a legacy
	 */
	  

	 public static void main(String[] args) {
		
		 // Homogeneous 
		 
		 Vector vc = new Vector();
		 
		 vc.add("Hassan");
		 vc.add(25);
		 vc.add(6.1);
		 
		 for (Object object : vc) {
			System.out.println(object);
			
		}
		 
		 // Heterogeneous 
		 
		 Vector<Integer> v = new Vector<Integer>();
		 v.add(25);
		 v.add(6);
		 
		 for (Integer integer : v) {
			System.out.println(integer);
		}
	}
}
