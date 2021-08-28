package com.vikrant.essentials.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ArraysGFG_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		// rotateBy1(arr);
		// missingInteger(arr);
		// pairsWithSum(arr, 11);
		// duplicates(arr);
		// commonElementsIn3SortedArray(ar1, ar2, ar3);
		// firstRepeating(arr);
		// firstNonRepeating(arr);
		// largest3WithoutSorting(arr);
//		reverseWithSingleSpaceComplexity(arr);
		rearrangeAlternatePosNeg(arr);
		

	}
	
	public static void subArrayWithSumZero(int[] arr){
		
	}
	
	public static void rearrangeAlternatePosNeg(int[] arr){
		List<Integer> neg = new ArrayList<>();
		List<Integer> pos = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				neg.add(arr[i]);
			}else{
				pos.add(arr[i]);
			}
		}
		int i=0, j=0, k=0;
		while(j<neg.size() && k<pos.size()){
			arr[i++]=neg.get(j++);
			arr[i++] = pos.get(k++);
		}
		while(j<neg.size()){
			arr[i++]=neg.get(j++);
		}
		while(k<pos.size()){
			arr[i++]=pos.get(k++);
		}
		
		for(int x=0;x<arr.length;x++){
			System.out.print(arr[x]+" ");
		}
	}

	public static void reverseWithSingleSpaceComplexity(int[] arr) {
		int mid = arr.length / 2;

		for (int i = 0; i < mid; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void largest3WithoutSorting(int[] arr) {
		int firstMax = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > firstMax) {
				thirdMax = secMax;
				secMax = firstMax;
				firstMax = arr[i];
			} else if (arr[i] < firstMax && arr[i] > secMax) {
				thirdMax = secMax;
				secMax = arr[i];
			} else if (arr[i] < secMax && arr[i] > thirdMax) {
				thirdMax = arr[i];
			}
		}

		System.out.println(firstMax);
		System.out.println(secMax);
		System.out.println(thirdMax);
	}

	public static void firstNonRepeating(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(arr[i]);
				break;
			}
		}

		// or

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void firstRepeating(int[] arr) {
		// for(int i=0;i<arr.length;i++){
		// for(int j=i+1;j<arr.length;j++){
		// if(arr[i]==arr[j]){
		// System.out.println(arr[i]);
		// return;
		// }
		// }
		// }

		// or
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) > 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void commonElementsIn3SortedArray(int[] arr1, int[] arr2, int[] arr3) {
		List<Integer> common = new ArrayList<>();
		int i = 0, j = 0, k = 0;
		// for(;i<arr1.length;i++){
		// for(;j<arr2.length && arr2[j]<=arr1[i];j++){
		// if(arr1[i]==arr2[j]){
		// for(;k<arr3.length && arr3[k]<=arr2[j];k++){
		// if(arr3[k]==arr1[i]){
		// common.add(arr1[i]);
		// break;
		// }
		// }
		// break;
		// }
		//
		// }
		// }

		// or

		while (i < arr1.length && j < arr2.length && k < arr3.length) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				common.add(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}

		System.out.println(common);
	}

	public static void rotateBy1(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr1[(i + 1) % arr.length] = arr[i];
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static void missingInteger(int[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		int n = max - min + 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Missing number is: " + ((n * (max + min) / 2) - sum));
	}

	public static void pairsWithSum(int[] arr, int sum) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int x : map.keySet()) {
			int elem = sum - x;
			if (x == elem) {
				count += map.get(x) * (map.get(x) - 1);
			} else {
				if (map.containsKey(elem)) {
					count += map.get(x) * map.get(elem);
				}
			}
		}
		System.out.println(count / 2);
	}

	public static void duplicates(int[] arr) {
		Map<Integer, Integer> elements = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (elements.containsKey(arr[i])) {
				elements.put(arr[i], elements.get(arr[i]) + 1);
			} else {
				elements.put(arr[i], 1);
			}
		}

		for (int x : elements.keySet()) {
			if (elements.get(x) > 1) {
				System.out.println(x);
			}
		}

	}

}
