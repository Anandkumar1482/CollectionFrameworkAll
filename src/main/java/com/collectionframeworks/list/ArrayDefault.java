package com.collectionframeworks.list;

import java.util.ArrayList;

public class ArrayDefault {
	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);

		l.add(11);
		System.out.println(l.size());
		//l.ensureCapacity(10);
		System.out.println(l);
	}
}
