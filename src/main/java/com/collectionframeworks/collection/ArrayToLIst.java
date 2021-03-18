package com.collectionframeworks.collection;

import java.util.Arrays;
import java.util.List;

public class ArrayToLIst {
	public static void main(String[] args) {
		String[] str = { "anand", "sai", "sankar", "uppi" };
		for (String string : str) {
			System.out.println(string);
		}
		List<String> li = Arrays.asList(str);
		System.out.println(li);
	}
}
