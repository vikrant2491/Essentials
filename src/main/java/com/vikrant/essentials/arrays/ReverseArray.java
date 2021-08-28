package com.vikrant.essentials.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("array is: ");
		int[] arr = {1, 2, 3, 4};
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
		
		reverseArr(arr);
	}
	
	public static void reverseArr(int[] arr){
		int i=0;
		int j= arr.length-1;
		while(i<j){
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;			
		}
		System.out.println();
		System.out.println("reverse array is: ");
		for(int k=0;k<arr.length;k++){
			System.out.print(arr[k]+" ");
		}
	}

}
