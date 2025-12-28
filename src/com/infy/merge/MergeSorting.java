package com.infy.merge;

import java.util.Arrays;

public class MergeSorting {
	
	public static void mergeSort(int[] numbers) {
		int length = numbers.length;
		if(length <=1) {
			return;
		}
		int mid = length/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[length - mid];
		int index = 0;
		for(int i=0; i<length; i++) {
			if(i< mid) {
				leftArray[i] = numbers[i];
			}else {
				rightArray[index++] = numbers[i];
			}
		}
		mergeSort(leftArray);
		mergeSort(rightArray);
		merging(leftArray, rightArray, numbers);
	}
	
	public static void merging(int[] leftArray, int[] rightArray, int[] arr) {
		int length = arr.length;
		int leftLength = length/2;
		int rightLength = length - leftLength;
		int i=0, j=0, k=0;
		while(j < rightLength && k < leftLength) {
			if(leftArray[j] < rightArray[k]) {
				arr[i++] = leftArray[j++];
			}else {
				arr[i++] = rightArray[k++];
			}
		}
		while(j < leftLength) {
			arr[i++] = leftArray[j++];
		}
		while(k < rightLength) {
			arr[i++] = rightArray[k++];
		}
	}

	public static void main(String[] args) {
		int[] numbers = {3,7,8,5,4,2,6,1};
		System.out.println("Array before sort:::");
		Arrays.stream(numbers).forEach(num -> System.out.print(num+" "));
		System.out.println();
		mergeSort(numbers);
		System.out.println("Sorted array is:::");
		Arrays.stream(numbers).forEach(num -> System.out.print(num+" "));
		
	}
	
}
