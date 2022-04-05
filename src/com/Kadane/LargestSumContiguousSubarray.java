package com.Kadane;

public class LargestSumContiguousSubarray {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		int Max_So_far = Integer.MIN_VALUE;
		int Max_ending_here = 0;

		for (int i = 0; i < arr.length; i++) {
			Max_ending_here = Max_ending_here + arr[i];
			if (Max_So_far < Max_ending_here) {
				Max_So_far = Max_ending_here;
			}
			if (Max_ending_here < 0) {
				Max_ending_here = 0;
			}
		}
		System.out.println(Max_So_far);
	}
}
