package com.string;

public class SingleLoopReversal {
	public static void main(String[] args) {	
		String str = "thriyesh";
		String revName = "";
		char[] reverse = str.toCharArray();
		for(int i=reverse.length-1; i>= 0; i--) {
			revName += reverse[i];
		}
		System.out.println(str);
		System.out.println("reverse is :" +revName);
		
		StringBuilder name= new StringBuilder("thriyesh");
		System.out.println(name.reverse());
		
		StringBuffer name2= new StringBuffer("thriyesh");
		System.out.println(name2.reverse());
	}
}