package com.collectionframeworks.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}
		System.out.println(l);
		Iterator<Integer> itr = l.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				itr.remove();
			}

		}
		System.out.println(l);

	}
}