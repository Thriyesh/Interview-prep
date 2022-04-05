package com.GoldmanSachs;

public class NonRepeatingDigitsInProduct {

	public static void main(String[] args) {
		int n = 2;
		int x = 10;
		int y = 12;
		int count = 0;
		for (int i = x; i <= y; i++) {
			if (digitPresent(i, n)) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean digitPresent(int x, int n) {
		String num = Integer.toString(x);
		String product = Integer.toString(x * n);
		//System.out.println(product);
		for (int i = 0; i < product.length(); i++) {
			for (int j = 0; j < num.length(); j++) {
				if (product.charAt(i) == num.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
