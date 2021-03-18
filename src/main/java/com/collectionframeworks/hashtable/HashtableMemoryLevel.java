package com.collectionframeworks.hashtable;

import java.util.Hashtable;

public class HashtableMemoryLevel {

	public static void main(String[] args) {
		Hashtable<Temp, String> hash = new Hashtable<Temp, String>();
		hash.put(new Temp(10), "A");
		hash.put(new Temp(2), "B");

		hash.put(new Temp(5), "C");
		hash.put(new Temp(4), "D");
		hash.put(new Temp(34), "E");
		hash.put(new Temp(23), "F");
		hash.put(new Temp(9), "G");
		System.out.println(hash);
	}
}

class Temp {
	int i;

	public Temp(int i) {
		this.i = i;

	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public String toString() {
		return i + " ";
	}
}