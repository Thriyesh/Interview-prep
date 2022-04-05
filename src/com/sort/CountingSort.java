package com.sort;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 1, 2, 7, 5, 2 };
		countSort(arr);
		// printArray(arr);
	}

	private static void countSort(int[] arr) {

		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("min:" + min);
		System.out.println("max:" + max);
		int range = max - min + 1;
		System.out.println(range);
		int[] count = new int[range];
		int[] result = new int[arr.length];
		// counting the no.of times the number appeared.
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - min]++;
		}
		// adding the previous counts.
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		printArray(count);
		// Placing the objects in the correct position in the output array and
		// decreasing the count by 1
		for (int i = arr.length - 1; i >= 0; i--) {
			result[count[arr[i] - min] - 1] = arr[i];
			count[arr[i] - min]--;
		}
		printArray(result);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
