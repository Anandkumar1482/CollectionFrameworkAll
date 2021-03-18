package com.collectionframeworks.collection;

import java.util.LinkedList;

public class LinkedLIstExample {
	public static void main(String[] args) {

		LinkedList<Integer> li = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			li.add(i);
		}

		System.out.println(li);
		System.out.println(li.size());
		li.add(11);
		System.out.println(li.size());

	}
}
