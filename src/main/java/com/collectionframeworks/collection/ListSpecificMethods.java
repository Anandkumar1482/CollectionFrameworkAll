package com.collectionframeworks.collection;

import java.util.ArrayList;
import java.util.List;

public class ListSpecificMethods {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();

		l.add("jai");
		l.add("sai");
		l.add("lucky");
		l.add("bunny");
		l.add("lalli");
		System.out.println(l);
		l.add(2, "lucy");
		List<String> l1 = new ArrayList<String>();
		l.addAll(3, l1);

		l1.add("jai");
		l1.add("sai");
		l1.add("lucky");
		System.out.println(l1);
		System.out.println(l1.indexOf(l1));

	}
}
