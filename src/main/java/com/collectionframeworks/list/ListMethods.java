package com.collectionframeworks.list;

import java.util.ArrayList;

public class ListMethods {
	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();
		l.add("anand");
		l.add("kuamr");
		l.add("ravi");
		l.add("sai");
		l.add(null);
		l.add("main");
		l.add(null);
		System.out.println(l);
		System.out.println(l.indexOf("sai"));
		System.out.println(l.lastIndexOf("sai"));
		// System.out.println(l);

	}
}
