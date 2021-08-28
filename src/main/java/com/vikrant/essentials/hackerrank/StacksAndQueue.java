package com.vikrant.essentials.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class StacksAndQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(isBalanced("{[()]}"));
		Integer[] arr = {11, 11, 10, 10, 10 };
		List<Integer> h = Arrays.asList(arr);
		System.out.println(largestRectangle(h));

	}
	
	static long[] riddle(long[] arr) {
        long[] res = new long[arr.length];
        for(int i=0;i<arr.length;i++){
        	long min=Long.MAX_VALUE;
        	for(int j=0;i+j<arr.length;j++){
        		if(arr[i+j]<min){
        			min = arr[i+j];
        		}
        		if(min>res[j]){
        			res[j] = min;
        		}        		
        	}
        }
		
		return res;
    }

	public static long largestRectangle(List<Integer> h) {
		Stack<Integer> st = new Stack<>();
		int maxArea = 0;
		int i = 0;
		while (i<h.size()) {
			if (st.isEmpty() || h.get(st.peek()) <= h.get(i)) {
				st.push(i);
				i++;
			} else {
				int elem = h.get(st.pop());
				int rightWall = i - 1;
				int leftWall =0;
				while (!st.isEmpty() && h.get(st.peek()) == elem) {
					st.pop();
				}
				if(!st.isEmpty()){
					leftWall = st.peek() + 1;
				}
				
				int area = elem * (rightWall - leftWall + 1);
				if (maxArea < area) {
					maxArea = area;
				}
			}
		}
		while(!st.isEmpty()){
			int elem = h.get(st.pop());
			int rightWall = i - 1;
			int leftWall =0;
			while (!st.isEmpty() && h.get(st.peek()) == elem) {
				st.pop();
			}
			if(!st.isEmpty()){
				leftWall = st.peek() + 1;
			}
			
			int area = elem * (rightWall - leftWall + 1);
			if (maxArea < area) {
				maxArea = area;
			}
		}

		return maxArea;
	}

	public static String isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> pairs = new HashMap<>();
		pairs.put('{', '}');
		pairs.put('(', ')');
		pairs.put('[', ']');
		stack.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (!stack.isEmpty() && pairs.containsKey(stack.peek()) && pairs.get(stack.peek()) == s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		if (stack.isEmpty()) {
			return "YES";
		} else {
			return "NO";
		}

	}

}
