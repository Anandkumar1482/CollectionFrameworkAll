package com.collectionframeworks.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		System.out.println(l);
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(5);
		// l1.clear();
		// System.out.println("clear method");
		System.out.println(l1);
		l1.add(10);
		l1.add(20);
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(10));
		// l1.clear();
		// System.out.println("clear method");
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println();
		Object[] obj = l1.toArray();
		for (Object object : obj) {
			System.out.println(object);
		}

	}
}
