package com.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenOddLists {

	 static public void main(String[] args) {

		List<Integer> numbers = Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		List<Integer> oddNumbers = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		filter(numbers, oddNumbers, evenNumbers);
	}
	public static void filter(List<Integer> numbers, List<Integer> oddNumbers, List<Integer> evenNumbers){
	    for(Integer n : numbers){
	        if(n % 2 != 0){
	            oddNumbers.add(n);
	            System.out.println("Odd : " +n);
	        }else{
	            evenNumbers.add(n);
	            System.out.println("Even : " +n);
	        }
	    }
	}
}
