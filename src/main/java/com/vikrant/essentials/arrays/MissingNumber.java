package com.vikrant.essentials.arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,4};
		System.out.println(getMissingNumber(arr, 1, 4));

	}
	
	public static long getMissingNumber(int[] arr, int start, int end){
		long sum = 0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		
		int n = end-start+1;
		return (n *(start+end))/2 - sum;
		
	}	
	

}
