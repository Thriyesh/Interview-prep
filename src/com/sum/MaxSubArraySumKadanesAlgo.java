package com.sum;

public class MaxSubArraySumKadanesAlgo {

	public static void main(String[] args) {

		int[] nums = { -4, 6, 2, -7, 11, 4, 9 };
		int maxSum = Integer.MIN_VALUE;
		int currentMax = 0;
		for (int i = 0; i < nums.length; i++) {
			currentMax = Math.max(nums[i],nums[i]+currentMax);
			maxSum = Math.max(maxSum, currentMax);
		}
		System.out.println(maxSum);
	}
}
