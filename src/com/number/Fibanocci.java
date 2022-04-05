package com.number;

public class Fibanocci {

	public static void main(String[] args) {
		int num = 5,a=0,b=1;
		int c =0;
		for(int i=2;i<num;i++) {
			c =a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}

}
