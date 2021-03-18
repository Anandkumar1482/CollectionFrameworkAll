package com.collectionframeworks.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(102, "guru");
		map.put(100, "anand");
		map.put(101, "kumar");
		map.put(103, "dandi");
		map.put(104, "nag");
		map.put(108, "ram");
		map.put(101, "dandi");
		System.out.println(map);
		map.put(109, "hari");
		System.out.println(map);
		Set<Integer> set = map.keySet();
		System.out.println(set);

		Collection<String> coll = map.values();
		System.out.println(coll);

		Set<Entry<Integer, String>> set1 = map.entrySet();
		System.out.println(set1);

		Iterator<Entry<Integer, String>> itr = set1.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();

			System.out.println(entry.getKey() + " ......  " + entry.getValue());
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

			if (entry.getKey().equals(104)) {
				entry.setValue("dandiiii");
			}
			System.out.println(entry.getValue());
		}
		System.out.println(set1);
	}
}
