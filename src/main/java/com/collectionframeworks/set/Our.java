package com.collectionframeworks.set;

import java.util.TreeSet;

public class Our {
	public static void main(String[] args) {

		Student e1 = new Student("nag", 100);
		Student e2 = new Student("balaiah", 200);
		Student e3 = new Student("chiru", 50);
		Student e4 = new Student("venki", 150);
		Student e5 = new Student("nag", 100);
		TreeSet<Student> t1 = new TreeSet<Student>(new Student());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}
}
