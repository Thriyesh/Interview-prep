package com.Nagarro;

import java.util.Scanner;

public class StudentReport {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int[][] marks = {{74,75,60,76},{84,85,80,86},{65,67,50,66}};

		int avg[] = new int[3];
		int row = 3;
		int col = 4;
		int res[] = new int[row];
		// Entering the values
		System.out.println("Enter the elments :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				//marks[i][j] = s.nextInt();
			}
		}
		// long avg =Long.MAX_VALUE;
		// int index = -1;
		// Find the Average of the each subject
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < row; j++) {
				sum = sum + marks[j][i];
			}
			avg[i] = sum / row;
		}
		int min = avg[0];
		int index = 0;
		for (int i = 1; i < row; i++) {
			if (avg[i] < min) {
				min = avg[i];
				index = i;
			}
		}
		System.out.println(index);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (index != j) {// calculating sum of remaining subjects
					res[i] += marks[i][j];
				}
			}
			s.close();
		}

		for (int j = 0; j < row; j++) {
			System.out.print(res[j] + " ");
		}
	}

}
