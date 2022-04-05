package com.string;

public class Reverse {

	public static void main(String[] args) {
		String s= "string";
		int i=s.length()-1;
		while(i>=0) {
			System.out.print(s.charAt(i));
			i--;
		}
	}
}
