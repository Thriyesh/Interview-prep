package com.chess;

public class ChessBoard {

	public static void main(String[] args) {
		int N =8;
		int num=0;
		for(int i=1;i<=N;i++) {
			num+=i*i;
		}
		System.out.println((N*(N+1)*(2*N+1))/6);
		System.out.println(num);
	}

}
