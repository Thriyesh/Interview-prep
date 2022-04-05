package com.arrays;

import java.util.Hashtable;

public class Duplicates {

	public static void main(String[] args) {

		int[] nums = {1,5,3,5,5,2,6,0,0};
		boolean present = false;
		Hashtable<Integer,Integer> nonDuplicates = new Hashtable<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nonDuplicates.containsKey(nums[i])) {
				present =true;
				System.out.println("Duplicate element is :" + nums[i]);
			}
			nonDuplicates.put(nums[i], i);
		}
		System.out.println(present);
	}

}
