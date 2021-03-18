package com.collectionframeworks.set;

public class Stu implements Comparable<Object> {
	String name;
	int eid;

	public Stu() {
	}

	Stu(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString() {
		return name + "----" + eid;
	}

	public int compareTo(Object o) {

		Stu i1 = (Stu) o;
		Stu i2 = (Stu) o;

		String n1 = i1.name;
		String n2 = i2.name;
		return n1.compareTo(n2);

	}
}
