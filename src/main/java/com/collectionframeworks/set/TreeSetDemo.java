package com.collectionframeworks.set;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("Z");
		t.add("L");
		// t.add(new Integer(10));//ClassCastException
		// t.add(null);//NullPointerException
		System.out.println(t);// [A, B, L, Z, a]
	}
}
