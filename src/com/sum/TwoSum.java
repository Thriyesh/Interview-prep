package com.sum;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums= {3,5};
		int target = 6;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for( int i = 0;i<nums.length;i++) {
			int compliment= target - nums[i];
			if(map.containsKey(nums[i])) {
				System.out.println("Indices :"+ map.get(nums[i]) +","+ i );
			}
			map.put(compliment,i);
		}
	}
}
