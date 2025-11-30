package com.infy.insertion;

import java.util.Arrays;

public class InsertionSorting {
	
	public static int[] insertionSorting(int[] arr) {
		int length = arr.length;
		for(int i=1; i<length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				arr[j] = key;
				j = j-1;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {17,2,30,22,80,3,4,19};
		System.out.println("Array before sorting");
		Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
		arr = insertionSorting(arr);
		System.out.println("\n Array after sorting");
		Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
	}

}
