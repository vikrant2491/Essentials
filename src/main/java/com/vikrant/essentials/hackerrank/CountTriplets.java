package com.vikrant.essentials.hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountTriplets {

	public static void main(String[] args) throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\BYO\\JavaWorkspace\\JavaEssentials\\input.txt"))));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int n = Integer.parseInt(nr[0]);
//
//        long r = Long.parseLong(nr[1]);

        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        System.out.println(arrItems.length);
        List<Long> arr = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr.add(arrItem);
        }

        long ans = countTriplets(arr, 3);
        System.out.println(ans);

//        bufferedWriter.write(String.valueOf(ans));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
	}
	
	static long countTriplets(List<Long> arr, long r) {
		Map<Long, Long> left = new HashMap<Long, Long>();
		Map<Long, Long> right = new HashMap<Long, Long>();
		long count=0;
		for(Long elem: arr){
			if(right.containsKey(elem)){
				right.put(elem, right.get(elem)+1);
			}else{
				right.put(elem, (long)1);
			}
		}
		
		for(Long elem: arr){			
			long c1=0;
			long c2=0;
			if(right.get(elem)>0){
				right.put(elem, right.get(elem)-1);
			}
			
			if(!left.isEmpty() && elem % r==0 && left.containsKey(elem/r)){
				c1 = left.get(elem/r);
			}
			if(!right.isEmpty() && right.containsKey(elem*r)){
				c2 = right.get(elem*r);
			}
			
			if(left.containsKey(elem)){
				left.put(elem, left.get(elem)+1);
			}else{
				left.put(elem, (long)1);
			}
			
			
			
			count += c1*c2;
		}
		
		return count;
	}

}
