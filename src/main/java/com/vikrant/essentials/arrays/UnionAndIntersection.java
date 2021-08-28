package com.vikrant.essentials.arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionAndIntersection {

	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 7, 10};
		int[] arr2 = {2, 4, 6, 10};
		System.out.println(union(arr1, arr2));
		System.out.println(intersect(arr1, arr2));
	}
	
	public static List<Integer> union(int[] arr1, int[] arr2){
		List<Integer> res = new ArrayList<Integer>();
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				res.add(arr1[i]);
				i++;
			}
			if(arr1[i]>arr2[j]){
				res.add(arr2[j]);
				j++;
			}
			
			if(arr1[i]==arr2[j]){
				res.add(arr1[i]);
				i++;
				j++;
			}
		}
		
		while(i<arr1.length){
			res.add(arr1[i]);
			i++;
		}
		
		while(j<arr2.length){
			res.add(arr2[j]);
			j++;
		}
		
		return res;
		
	}
	
	public static List<Integer> intersect(int[] arr1, int[] arr2){
		List<Integer> res = new ArrayList<Integer>();
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]==arr2[j]){
				res.add(arr1[i]);
				i++;
				j++;
			}else
			if(arr1[i]<arr2[j]){
				i++;
			}else
			if(arr1[i]>arr2[j]){
				j++;
			}
		}
		return res;
	}

}
