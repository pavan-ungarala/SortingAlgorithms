package com.infy.selection;

import java.util.Arrays;

public class SelectionSorting {
	
	public static int[] selectionSorting(int[] arr) {
		int i,j = 0;
		int length = arr.length;
		for(i=0; i<length-1; i++) {
			int min = i;
			for(j=i+1; j<length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {9,3,1,4,2,7,5};
		System.out.println("Array before sorting");
		Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
		arr = selectionSorting(arr);
		System.out.println("\n Array after sorting");
		Arrays.stream(arr).forEach(num -> System.out.print(num+" "));
	}

}
