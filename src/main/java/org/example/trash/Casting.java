package org.example.trash;

import java.util.ArrayList;
import java.util.List;

class Casting {

	/**
	 * 
	 * Wide casing scenrio
	 */


	public static void main(String[] args) {
		int x = 0;
		List<Integer> list = new ArrayList<>();
		list.add(0);
		System.out.println(list.size());
		Integer integer = Integer.valueOf(0);
		list.add(integer);

	}
}