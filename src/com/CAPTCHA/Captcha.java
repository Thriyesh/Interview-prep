package com.CAPTCHA;

import java.util.Random;

public class Captcha {
	public static void main(String[] args) {
		char [] captcha = {'1','2','3','4','5','6','7','8','9','0','A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',};
		String CAPTCHA= "";
		Random random = new Random();
		for(int i=0;i<=5;i++) {
			CAPTCHA +=  captcha[random.nextInt(61)];
		}
		System.out.println(CAPTCHA);
	}
}
