package com.Recro;

public class CountOfSubstringsContainingKOnes {

	public static void main(String[] args) {
		String s = "10010";
		int K = 1;
		/*
		 * int onesCount = 0; int subCount = 0;
		 * 
		 * for (int i = 0; i < s.length(); i++) { for (int j = i; j < s.length(); j++) {
		 * if (s.charAt(j) == '1') { onesCount++; System.out.println(onesCount); } if
		 * (onesCount == K) { subCount++; } } }
		 */

		int N = s.length();
		int res = 0;
		int countOfOne = 0;
		int[] freq = new int[N + 1];

		// initialize index having zero // sum as 1
		freq[0] = 1;

		// loop over binary characters // of string
		for (int i = 0; i < N; i++) {

			// update countOfOne variable // with value of ith character
			countOfOne += (s.charAt(i) - '0');
			// System.out.println(s.charAt(i) - '0'); // if value reaches more than // K,
			// then update result
			if (countOfOne >= K) {
				// System.out.println(countOfOne); // add frequency of indices, // having sum
				// (current sum - K), // to the result
				res += freq[countOfOne - K];
			}

			// update frequency of one's count
			freq[countOfOne]++;
		}

		System.out.println(res);

		// System.out.println(subCount);
	}

}
