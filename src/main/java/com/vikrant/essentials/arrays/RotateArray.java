package com.vikrant.essentials.arrays;

import java.util.Stack;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr1 = rotateArray(arr, 1);
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}

	}
	
	public static int[] rotateArray(int[] arr, int k){
		
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arr1[(i+k)%(arr.length)] = arr[i];
		}
		String str = "";
		
		return arr1;
	}

}
