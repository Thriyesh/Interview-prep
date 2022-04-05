package com.singleton;

public class Singleton {
	public static void main(String[] args) {
		Singleton s = Singleton2.getInstance();
		Singleton t = Singleton2.getInstance();
		Singleton u = Singleton2.getInstance();
		if (s == t && t == u) {
			System.out.println("All are same");
		}
	}
}

class Singleton2 {
	private static Singleton obj = null;

	private Singleton2() {
	}
	public static synchronized  Singleton getInstance() {
		if (obj == null) {
				obj = new Singleton();
		}
		return obj;
	}
}
