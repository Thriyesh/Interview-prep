package com.recamanssequence;

import java.util.HashSet;

public class RacamansSequence {

	public static void main(String[] args) {
		int n = 6;
		HashSet<Integer> set = new HashSet<>();
		/*
		 * int currentElement = 0; for(int i=1;i<n;i++) { if((currentElement-i)>0) {
		 * currentElement=currentElement-i; if(set.add(currentElement))
		 * System.out.println(currentElement); }
		 * 
		 * currentElement=currentElement+i; if(set.add(currentElement))
		 * System.out.println(currentElement);
		 * 
		 * }
		 */
		set.add(0);
		System.out.print(0 + " ");
		int previous = 0;
		for (int i = 1; i < n; i++) {
			int current = previous - i;
			if (current < 0 || set.contains(current)) {
				current = previous + i;
			}
			set.add(current);
			System.out.print(current+ " ");
			previous = current;
		}
	}

}
