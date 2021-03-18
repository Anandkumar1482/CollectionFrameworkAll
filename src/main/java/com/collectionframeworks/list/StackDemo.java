package com.collectionframeworks.list;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("40");
		s.push("30");
		s.push("20");
		s.push("10");
		System.out.println(s);// [A, B, C]
		System.out.println(s.pop());// C
		System.out.println(s);// [A, B]
		System.out.println(s.peek());// B
		System.out.println(s.search("30"));// 2
		System.out.println(s.search("40"));// -1
		System.out.println(s.empty());// false
		System.out.println(s.capacity());
	}
}
