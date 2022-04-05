package com.sort;

public class HeapSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		//int len = arr.length;
		sort(arr);
		printArray(arr);
	}

	static void sort(int[] arr) {

		int len = arr.length;
		// Build heap (rearrange array
		for (int i = len / 2 - 1; i >= 0; i--) {
			heapify(arr, len, i);
		}

		// One by one extract an element from heap

		for (int i = len - 1; i > 0; i--) {
			// move the current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// First element is moved to end so
			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is the size of heap.
	private static void heapify(int[] arr, int len, int i) {
		int largest = i; // Initialize largest as root
		int left = 2 * i + 1; // left
		int right = 2 * i + 2; // right

		// if left child is larger than root
		if (left < len && arr[left] > arr[largest]) {
			largest = left;
		}

		// if right child is larger than root
		if (right < len && arr[right] > arr[largest]) {
			largest = right;
		}

		// If largest is not root
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;

			// Recursively heapify the affected sub-tree
			heapify(arr, len, largest);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
