package com.collectionframeworks.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparisionLength {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyC());
		ts.add("Apj Adhulkalam");
		ts.add(new StringBuffer("gandhi"));
		ts.add("Bhagath Sing");
		ts.add("Alluri Seetharamaraj");
		ts.add("Cheguveera");
		ts.add(new StringBuffer("Ntr"));
		ts.add(new StringBuffer("abc"));
		System.out.println(ts);
	}
}

class MyC implements Comparator<Object> {

	public int compare(Object o1, Object o2) {
		String s1 = (String) o1.toString();
		String s2 = (String) o2.toString();
		int I1 = s1.length();
		System.out.println(I1);
		int I2 = s2.length();
		System.out.println(I2);
		if (I1 < I2) {
			return -1;
		} else if (I1 > I2) {
			return +1;
		} else
			//return s1.compareTo(s2);
		 return 0;
	}

}
