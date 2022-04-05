package com.sum;
import java.util.Arrays;

public class MoveZerostoEnd {

	public static void main(String[] args) {
		int j = -1;
		int[] nums = { 2, 0, 6, 0, 7, 4 };
		int[] newNums = new int[nums.length];
		//System.out.println(Arrays.toString(newNums));
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				newNums[++j] = nums[i];
			}
		}
		System.out.println(Arrays.toString(newNums));
		//Arrays.fill(newNums, j+1, nums.length, -1);
		//System.out.println(Arrays.toString(newNums));
	}

}
