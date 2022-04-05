package com.arrays;

import java.util.Arrays;

public class NonDuplicateSum {
	public static void main(String[] args) {	
		int[] arr = {2,4,5,1,4,9,4,6};
		Arrays.sort(arr);
		int sum = arr[0];
		for (int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				sum += arr[i+1];
			}
		}
		System.out.println(sum);
	}
}
