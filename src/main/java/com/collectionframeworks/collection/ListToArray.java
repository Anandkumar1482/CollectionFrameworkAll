package com.collectionframeworks.collection;

import java.util.ArrayList;

public class ListToArray {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("anand");
		l.add("kuamr");
		l.add("ravi");
		l.add("sai");
		l.add("main");
		System.out.println(l);
		Object[] obj = l.toArray();
		for (Object objects : obj) {
			System.out.println(objects);
		}
		
		System.out.println();
		
	    
		
		
	}
}
