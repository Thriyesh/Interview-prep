package com.sum;

public class MaxSubArraySum {

	public static void main(String[] args) {
		
		int[] nums = { -4, 6, 2, -7, 11, 4, -9 };
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				maxSum = Math.max(maxSum, sum);
			}
		}
		System.out.println(maxSum);
	}
}
