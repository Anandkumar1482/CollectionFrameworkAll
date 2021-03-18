package com.collectionframeworks.set;

import java.util.Collections;
import java.util.HashSet;

public class HashDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>(16);
		set.add("Z");
		//System.out.println(set.hashCode());
		set.add("B");
		set.add("N");
		System.out.println(set.hashCode());
		
	}
}
