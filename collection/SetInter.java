package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetInter {

	/**
	 * Now we will learn to use another main interface of collection caless Set.
	 * Set also includes combination of classes that works exactly smae as Interface Link classess.
	 * 
	 * 
	 *  Classes of Set:
	 *    HashSet ( it also contains another class LinkedHashSet )
	 *    
	 * 
	 */
	
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("My name is Hassan Khan");
		set.add("I am 25 years old");
		
		
		for (String string : set) {
			System.out.println(string);
		}
		
		/*
		 * we wrote Set set = new HashSet();, we did that because HashSet class comes form Set interface
		 * we can write it as HashSet set = new HashSet(); also, its same thing.
		 */
		
		
		
	}
}
