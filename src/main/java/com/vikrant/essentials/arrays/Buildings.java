package com.vikrant.essentials.arrays;

import java.util.HashMap;

public class Buildings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] buildings = {7, 9, 8, 7, 7, 8, 9, 10, 10, 11};
		visibleBuildings(buildings);

	}
	
	public static void visibleBuildings(int[] arr){
		HashMap<Integer, Integer> towers = new HashMap<>();
		
		int prev = arr[0];
		towers.put(1, arr[0]);
		for(int i=1;i<arr.length;i++){
			if(arr[i]>prev){
				towers.put(i+1, arr[i]);
				prev = arr[i];
			}
		}
		System.out.println(towers);
		
	}
	
	

}
