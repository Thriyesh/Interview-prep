
package com.Nagarro;

import java.util.Scanner;

public class CPPToJavaVariables {
	public static void main(String[] args) {

		String newString = "";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the String:");
		String str = s.nextLine();
		if (str.contains("_")) {
			System.out.println("C++");
			String[] arr = str.split("_");
			newString = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (i != 0) {
					arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
					newString = newString + arr[i];
				}
			}
		} else {

			char[] arr = str.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (Character.isUpperCase(arr[i])) {
					newString = newString + "_" + Character.toUpperCase(arr[i]);
				} else {
					newString = newString + arr[i];
				}
			}
			System.out.println("Java");
		}
		System.out.println(newString);
		s.close();// j_is_a_var, jIsAVar
	}
}
