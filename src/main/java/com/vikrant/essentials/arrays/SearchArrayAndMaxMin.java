package com.vikrant.essentials.arrays;

import java.util.Arrays;

public class SearchArrayAndMaxMin {

	public static void main(String[] args) {
		int[] arr = {2,5,7,11,12};
		System.out.println(isElementPresent(arr, 7));
		System.out.println(existInSortedArray(arr, 7, 0, 4));
		System.out.println(findMax(arr));
		System.out.println(findMin(arr));
		printMaxMin(arr);
	}
	
	public static boolean isElementPresent(int[] arr, int n){
		boolean status = false;
		for(int i=0;i<arr.length;i++){
			if(n==arr[i]){
				status = true;
				break;
			}
		}
		return status;
	}
	
	public static boolean existInSortedArray(int[] arr, int n, int start, int end){
		boolean status = false;
		int mid=(end+start)/2;
		if(start<=end){
			if(arr[mid]==n){
				status = true;
			}else if(arr[mid]>n){
				status = existInSortedArray(arr, n, start, mid);				
			}else if(arr[mid]<n){
				status = existInSortedArray(arr, n, mid+1, end);
			}
		}
		return status;
	}
	
	public static int findMax(int[] arr){
		int min = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMin(int[] arr){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void printMaxMin(int[] arr){
		Arrays.sort(arr);
		System.out.println("Min: "+arr[0]);
		System.out.println("Max: "+arr[arr.length-1]);
	}

}
