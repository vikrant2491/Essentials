package com.vikrant.essentials.arrays;

import java.util.ArrayList;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 1, 6, 2};
		arr= Sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
		
		arr = mergeSort(arr, 4);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+ " ");
		}
				

	}
	
	public static int[] Sort(int[] arr){		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}			
		}
		
		return arr;
	}
	
	public static int[] mergeSort(int[] arr, int n){
		int mid = n/2;
		int[] left = mSort(arr, 0, mid);
		int[] right = mSort(arr, mid+1, arr.length-1);
		arr = merge(left, right);
		return arr;
		
	}
	
	public static int[] mSort(int[] arr, int i, int j){
		arr = mergeSort(arr, (j-i)+1);
		return arr;
		
	}
	
	public static int[] merge(int[] left, int[] right){
		List<Integer> finalArr = new ArrayList();
		int i=0, j=0;
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				finalArr.add(left[i]);
				i++;
			}
			if(left[i]>right[j]){
				finalArr.add(right[j]);
				j++;
			}
			
		}
		
		while(i<left.length){
			finalArr.add(left[i]);
			i++;
		}
		while(j<right.length){
			finalArr.add(right[j]);
			j++;
		}
		
		int[] finalArr1 = new int[finalArr.size()];
		int k =0;
		for(int elem: finalArr){
			finalArr1[k]=elem;
			k++;
			}
		return finalArr1;
		
	}
	
	
}
