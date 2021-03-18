package com.collectionframeworks.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class ArrayListSynchronized {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("anand");
		l.add("kuamr");
		l.add("ravi");
		l.add("sai");
		l.add("main");
		System.out.println(l);

		List<String> list = Collections.synchronizedList(l);
		synchronized (list) {  //must be synchronized block
			Iterator<String> li = list.iterator();
			while (li.hasNext()) {
				System.out.println(li.next());
			}

		}

	}
}
