package com.arrays;

import java.util.Arrays;

public class RotatingAnArraySimplified {

	public static void main(String[] args) {

		int[] nums = { 1, 5, 3, 5, 5, 2, 6, 0, 9 };
		int k = 3;
		int n=nums.length;
		k=k%n;
		//System.out.println(k);
		int[] newNums = new int[nums.length];
		for(int i=0,j=0;i<nums.length;i++) {
			if(i<k) {
				System.out.println(nums[n+i-k]);
				newNums[j++]=nums[n+i-k];
			}
			else {
				System.out.println(nums[i-k]);
				newNums[j++]=nums[i-k];
			}
		}
		System.out.println(Arrays.toString(newNums));
	
	}

}
