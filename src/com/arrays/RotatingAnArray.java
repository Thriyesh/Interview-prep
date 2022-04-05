package com.arrays;

import java.util.Arrays;

public class RotatingAnArray {

	public static void main(String[] args) {

		int[] nums = { 1, 5, 3, 5, 5, 2, 6, 0, 9 };
		int k = 3;
		int[] newNums = new int[nums.length];
		for(int i=0;i<k;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(j==0) {
					newNums[j] = nums[nums.length-1];
				}
				newNums[j+1] = nums[j];
			}
			nums=newNums.clone();
		}
		System.out.println(Arrays.toString(newNums));
	}

}
