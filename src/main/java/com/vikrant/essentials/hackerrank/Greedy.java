package com.vikrant.essentials.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Greedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> contests = new ArrayList<>();
		List<Integer> inner = new ArrayList<Integer>();
		inner.add(5);
		inner.add(1);
		contests.add(inner);
		inner = new ArrayList<Integer>();
		inner.add(2);
		inner.add(1);
		contests.add(inner);
		inner = new ArrayList<Integer>();
		inner.add(1);
		inner.add(1);
		contests.add(inner);
		inner = new ArrayList<Integer>();
		inner.add(8);
		inner.add(1);
		contests.add(inner);
		inner = new ArrayList<Integer>();
		inner.add(10);
		inner.add(0);
		contests.add(inner);
		inner = new ArrayList<Integer>();
		inner.add(5);
		inner.add(0);
		contests.add(inner);
		System.out.println(luckBalance(3, contests));
	}

	public static int minimumAbsoluteDifference(List<Integer> arr) {
		// Write your code here
		int diff = Integer.MAX_VALUE;
		// for(int i=0;i<arr.size();i++){
		// for(int j=i+1;j<arr.size();j++){
		// int abs = Math.abs(arr.get(i)-arr.get(j));
		// if(diff>abs){
		// diff = abs;
		// }
		// }
		// }
		// or
		Collections.sort(arr);
		for (int i = 0; i < arr.size() - 1; i++) {
			int abs = Math.abs(arr.get(i) - arr.get(i + 1));
			if (abs < diff) {
				diff = abs;
			}
		}
		return diff;
	}

	public static int luckBalance(int k, List<List<Integer>> contests) {
		// Write your code here
		int balance = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < contests.size(); i++) {
			if (contests.get(i).get(1) == 0) {
				balance += contests.get(i).get(0);
			} else {
				pq.offer(contests.get(i).get(0));
			}
		}
		while (!pq.isEmpty() && k > 0) {
			balance += pq.poll();
			k--;
		}
		while (!pq.isEmpty()) {
			balance -= pq.poll();
		}

		return balance;

	}
	
	static int getMinimumCost(int k, int[] c) {
		int sum = 0;	
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		int[] purchases = new int[k];
		for(int i=0;i<c.length;i++){
			pq.offer(c[i]);
		}
		int len = c.length;
		int customers = k;
		while(len>0){
			sum += (purchases[k-1]+1)*pq.poll();
			purchases[k-1]++;
			k--;
			len--;
			if(k==1){
				k=customers;
			}
		}
		return sum;
    }
	
	public static int maxMin(int k, List<Integer> arr) {
	    // Write your code here
		Collections.sort(arr);
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.size()-k;i++){			
			int diff = arr.get(i+k-1)-arr.get(i);
			if(diff<min){
				min = diff;
			}			
		}
		
		return min;
	    }

}
