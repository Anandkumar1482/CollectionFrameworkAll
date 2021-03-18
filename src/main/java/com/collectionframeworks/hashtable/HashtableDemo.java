package com.collectionframeworks.hashtable;

import java.util.Hashtable;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("C", 0);
		System.out.println(ht.hashCode());
	}
}
