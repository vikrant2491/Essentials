package com.vikrant.essentials.arrays;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1,5,2,3,5,3};
		System.out.println(duplicate(arr));

	}
	
	public static List<Integer> duplicate(int[] arr){
		HashMap<Integer, Integer> freq = new HashMap<>();
		List<Integer> duplicates = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(freq.containsKey(arr[i]))
				freq.put(arr[i], freq.get(arr[i])+1);
			else
				freq.put(arr[i], 1);
		}
		
		for(int elem: freq.keySet()){
			if(freq.get(elem)>1)
				duplicates.add(elem);
		}
		return duplicates;
	}

}
