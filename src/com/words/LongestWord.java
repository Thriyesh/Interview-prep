package com.words;

import java.util.Arrays;

public class LongestWord {

	public static void main(String[] args) {
		String sentence = "This is Thriyesh!";
		String[] strArray  = sentence.split(" ");
		int length=0;
		String LongestWord= "";
		/*
		 * Arrays.stream(strArray).forEach(s -> { if(s.length()>length) { length
		 * =s.length(); } });
		 */
		for(int i=0;i<strArray.length;i++) {
			//length = Math.max(length, strArray[i].length());
			if(strArray[i].length()>length) {
				length = strArray[i].length();
				LongestWord=strArray[i];
			}
		}
		System.out.println(Arrays.toString(strArray));
		System.out.println(length);
		System.out.println(LongestWord);
	}

}
