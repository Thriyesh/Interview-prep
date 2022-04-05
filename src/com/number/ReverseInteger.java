package com.number;

public class ReverseInteger {

	public static void main(String[] args) {
				int num = -122;
				int reverse=0;
				int sign = Integer.signum(num);
				num=Math.abs(num);
				while(num>0) {
					reverse=reverse*10 + num%10;
					num = num / 10;
				}
				System.out.println(reverse*sign);
				num = 100;
				int reverse2=0;
				boolean negative =num < 0 ? true: false;
				if(negative) num= num *-1;
				while(num>0) {
					reverse2=reverse2*10 + num%10;
					num = num / 10;
				}
				System.out.println(negative == true ? reverse2*-1:reverse2);
	}

}
