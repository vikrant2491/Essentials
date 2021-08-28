package com.vikrant.java.essentials.base;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Epam{

	public static void main(String[] args){
		int[] A = {1,1,2,2,2,3,3,4,4,5};
		findFrequency(A);
	}
	
	public static void findFrequency(int[] arr){
	
		Map<Integer, Integer> freq = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(freq.containsKey(arr[i])){			
				freq.put(arr[i], freq.get(arr[i])+1);
			}else{
				freq.put(arr[i], 1);
			}
		}
		
		Iterator<Integer> itr = freq.keySet().iterator();
		while(itr.hasNext()){
			int elem = itr.next();
			System.out.println(elem +" "+ freq.get(elem));
		}
		
		Iterator<Entry<Integer, Integer>> itr1 = freq.entrySet().iterator();
		while(itr1.hasNext()){
			Entry elem = itr1.next();
			System.out.println(elem.getKey()+" "+elem.getValue());
		}
	}
	
	
}