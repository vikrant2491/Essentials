package com.vikrant.essentials.hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public static int pairs1(int k, List<Integer> arr) {
		// Write your code here
		Collections.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.size()-1; i++) {
			int j = arr.size()-1;
			while (i < j) {
				if (arr.get(j) - arr.get(i) == k) {
					count++;
					j--;
				}else if(arr.get(j)-arr.get(i)>k){
					j--;
				}else{
					break;
				}
				
			}
		}

		return count;

	}
	
	public static int pairs(int k, List<Integer> arr) {
		int count=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int key: arr){
			if(map.containsKey(key)){
				map.put(key, map.get(key)+1);
			}else{
				map.put(key, 1);
			}
		}
		for(int key: map.keySet()){
			int elem = key+k;
			if(map.containsKey(elem)){
				count += map.get(key)*map.get(elem);
			}
		}
		
		return count;
	}
}
