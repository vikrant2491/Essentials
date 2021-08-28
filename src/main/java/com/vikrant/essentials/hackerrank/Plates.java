package com.vikrant.essentials.hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class Plates {

	public static void main(String[] args) {
		int[] arr = {1, 2, 5, 4};
		int shuffles = minShifts(arr);
		if(shuffles==-1){
			System.out.println("Cannot be shifted using given process");
		}else{
			System.out.println("Shifted in "+shuffles);
		}

	}
	
	public static int minShifts(int[] arr){
		int shuffles = 0;
		int length = arr.length;
		HashMap<Integer, Integer> tables = new HashMap<>();
		HashMap<Integer, Integer> platesPosition = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			tables.put(i, 1);
			platesPosition.put(arr[i], i);
		}
		
		Arrays.sort(arr);
		int i = arr.length-2;
		int biggestPlatePos = platesPosition.get(arr[length-1]);
		while(i>=0){
			int posDiff = biggestPlatePos-platesPosition.get(arr[i]);
			
			if(Math.abs(posDiff)==1){				
				platesPosition.put(arr[i], biggestPlatePos);
				tables.put(i, tables.get(i)-1);
				tables.put(biggestPlatePos, tables.get(biggestPlatePos)+1);
				i--;		
				shuffles++;
				
			}else if(posDiff>1 && tables.get(i+1)==0){
				platesPosition.put(arr[i], i+1);
				tables.put(i, tables.get(i)-1);
				tables.put(i+1, tables.get(i+1)+1);	
				shuffles++;
			}else if(posDiff<-1 && tables.get(i-1)==0){
				platesPosition.put(arr[i], i-1);
				tables.put(i, tables.get(i)-1);
				tables.put(i+1, tables.get(i-1)+1);	
				shuffles++;
			}else{
				shuffles = -1;
				break;
			}
		}
		
		return shuffles;
		
	}

}
