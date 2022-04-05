package com.GoldmanSachs;

import java.util.List;

public class TravellerFund {

	public static void main(String[] args) {

		List<Integer> expense = List.of(4, 5, -24, 2, 4, -49);
		int sum = 0;
		int min = 0;
		for (int i = 0; i < expense.size(); i++) {
			sum += expense.get(i);
			if (sum <= 0) {
				min = min + Math.abs(sum) + 1;
				sum = sum + min;
			}
		}
		System.out.println(min);
	}

}
