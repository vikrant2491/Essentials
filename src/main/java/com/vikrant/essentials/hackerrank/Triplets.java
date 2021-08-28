package com.vikrant.essentials.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {41705157,97849134,45597343,16768845,22004255,8599189,2105694,89992290,67225143,89110311};
		int[] b = {13272876,84702911,8455586,8597056,131603,80740505,44236720,92144494,57795598};
		int[] c = {82044489,35357393,83576278,87430244,76673809,10617871,83652958,21631708};
		System.out.println(triplets(a, b, c));

	}
	
	static long triplets(int[] a, int[] b, int[] c) {
		long count = 0;
		List<Integer> A = sortedlist(a);
		List<Integer> B = sortedlist(b);
		List<Integer> C = sortedlist(c);
		System.out.println("A+ "+A);
		System.out.println("B+ "+B);
		System.out.println("C+ "+C);
		for(int i =B.size()-1;i>=0;i--){
			int aCount = binarySearch(A, 0, A.size()-1, B.get(i))+1;
			int cCount = binarySearch(C, 0, C.size()-1, B.get(i))+1;
			if(aCount==0 || cCount==0){
				break;
			}else{
				count +=aCount*cCount;
			}
			
		}
		return count;
	}
	
	static int binarySearch(List<Integer> arr, int l, int r, int n){
		int count = -1;
		if(r>=l){
		int mid = l+(r-l)/2;
		if(arr.get(mid)>n){
			count = binarySearch(arr, l, mid-1, n);
		}
		if(arr.get(mid)<n){
			count = binarySearch(arr, mid+1, r, n);
		}
		if(arr.get(mid)==n){
			count = mid;
		}
		}else{
			count = (l<r)?l:r;
		}
		return count;
		
	}
	
	static List<Integer> sortedlist(int[] arr){
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		list.addAll(set);
		Collections.sort(list);
		return list;
	}
	
	

}
