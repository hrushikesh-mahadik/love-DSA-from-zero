package collection.list.arraylist;

import java.util.*;

public class ozArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(1);
		System.out.println(list);

		Object arr[] = list.toArray();
		for (Object obj : arr) {
			System.out.println("  " + obj);

		}

		System.out.println(list.contains(2));
		System.out.println("Entire ARRAYLIST : " + list);

		// sort arraylist

		Collections.sort(list);
		System.out.println("After Sorting Array: " + list);

		Collections.reverse(list);
		System.out.println("REVERSE ARRAY LIST: " + list);
		
		
		// clone
		
		Object list2 =((ArrayList<Integer>) list).clone();
		System.out.println(list2);
		
		// ensurecapacity 
		
		ArrayList<Integer> mark = new ArrayList<>();
		mark.ensureCapacity(7);
		mark.add(2);
		mark.add(3);
		mark.add(4);
		mark.add(5);
		mark.add(6);
		mark.add(7);
		mark.add(8);
		mark.add(9);
		mark.add(10);
		System.out.println(mark);
		
	}
}
