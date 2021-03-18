package com.collectionframeworks.map;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(100, "anand");
		h.put(101, "kumar");
		h.put(103, "dandi");
		System.out.println(h.hashCode());
		h.put(104, "nag");
		System.out.println(h);
		h.put(104, "gowtham");
		System.out.println(h);
		System.out.println(h.get(100));
		System.out.println(h.remove(101));

	}
}
