package com.vikrant.essentials.arrays;

import java.util.ArrayList;
import java.util.List;

public class Segments {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3, 3};
		findSegments(arr, 3, 3);
	}
	
	public static void findSegments(int[] arr, int x, int size){
		int count = 0;
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<arr.length && i+size<arr.length;i=i+size){
			for(int j=i;j<i+size;j++){
				if(arr[j]==x){
					count++;
					res.add(j);
					break;
				}
			}
		}
		
		System.out.println(count);
		System.out.println(res);
	}

}
