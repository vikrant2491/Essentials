package com.vikrant.essentials.arrays;

import java.util.Arrays;

public class KthElement{

	public static void main(String[] args){
	int[] arr = {1, 2, 3, 4, 5, 6, 7};
	System.out.println("K- smallest element is: "+K_Smallest(arr, 3));
	System.out.println("K-largest element is: "+K_Largest(arr, 3));
	
	}
	
	public static int K_Largest(int[] arr, int k){
		Arrays.sort(arr);
		return arr[arr.length-k];
	}
	
	public static int K_Smallest(int[] arr, int k){
		Arrays.sort(arr);
		return arr[k-1];
	}
}
