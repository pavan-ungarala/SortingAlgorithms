package com.infy.merge;

import java.util.Arrays;

public class MergeSorting {
	
	public static void mergeSort(int[] arr) {
		
	}
	
	public static int[] merging(int[] leftArray, int[] rightArray, int[] arr) {
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
		return arr;
	}

	public static void main(String[] args) {
		int[] numbers = {3,7,8,5,4,2,6,1};
		int min = 0;
		int length = numbers.length;
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
		
		int[] sortedArr = merging(leftArray, rightArray, numbers);
		System.out.println("Sorted array is:::");
		Arrays.stream(sortedArr).forEach(num -> System.out.print(num+" "));
		
	}
	
	

}
