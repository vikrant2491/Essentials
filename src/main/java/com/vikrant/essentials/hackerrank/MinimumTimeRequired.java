package com.vikrant.essentials.hackerrank;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MinimumTimeRequired {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		long[] machines = new long[10000];
		int j=0;
		BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
		String line ;
		while((line=reader.readLine())!=null){
			String[] arr = line.trim().split(" ");
			for(String str: arr){
				machines[j]= Long.valueOf(str.trim());
				j++;
			}
			
		}
		System.out.println(minTime(machines, 1667));

	}
	
	static long minTime(long[] machines, long goal) {
		long min =machines[0], max=machines[0];
		for(int i=0;i<machines.length;i++){
			if(machines[i]<min){
				min = machines[i];
			}
			if(machines[i]>max){
				max = machines[i];
			}
		}
		min = (long)(Math.ceil((double)goal/machines.length)*min);
		max = (long)(Math.ceil((double)goal/machines.length)*max);
		return binarySearch(machines, min, max, goal);
	}
	
	static long binarySearch(long[] machines, long min, long max, long goal){
		long work = 0, days = 0;
		long mid = (max+min)/2;
		work = getWork(machines, mid);
		if(min<max){
			if(work>goal){
				days = binarySearch(machines, min, mid-1, goal);
			}
			if(work<goal){
				days = binarySearch(machines, mid+1, max, goal);
			}
			if(work==goal){				
				while(getWork(machines, mid-1)==goal){
					mid--;
					
				}
				days = mid;
				return days;
			}
		}else{
			days = mid;
		}		
		return days;
	}
	
	static long getWork(long[] machines, long days){
		long work = 0;
		for(int i=0;i<machines.length;i++){
			work += days/machines[i];
		}
		return work;
	}
	
	
	

}
