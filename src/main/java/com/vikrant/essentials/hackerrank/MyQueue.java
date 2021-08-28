package com.vikrant.essentials.hackerrank;

import java.util.LinkedList;
import java.util.Stack;

public class MyQueue {	
	Stack<Integer> st = new Stack<>();
	Stack<Integer> st2 = new Stack<>();
	
	public void enqueue(int elem){
		st.push(elem);
	}
	
	public void dequeue(){
		while(!st.isEmpty()){
			st2.push(st.pop());
		}
		st2.pop();
		while(!st2.isEmpty()){
			st.push(st2.pop());
		}
	}
	
	public int peek(){
		while(!st.isEmpty()){
			st2.push(st.pop());
		}
		int elem = st2.peek();
		while(!st2.isEmpty()){
			st.push(st2.pop());
		}
		return elem;
	}

}
