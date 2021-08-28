package com.vikrant.essentials.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		res.add(list);
		list = new ArrayList<>();
		list.add(4);
		list.add(-1);
		res.add(list);
		list = new ArrayList<>();
		list.add(5);
		list.add(-1);
		res.add(list);
		list = new ArrayList<>();
		list.add(6);
		list.add(-1);
		res.add(list);
		list = new ArrayList<>();
		list.add(7);
		list.add(8);
		res.add(list);
		list = new ArrayList<>();
		list.add(-1);
		list.add(9);
		res.add(list);
		list = new ArrayList<>();
		list.add(-1);
		list.add(-1);
		res.add(list);
		list = new ArrayList<>();
		list.add(10);
		list.add(11);
		res.add(list);
		list = new ArrayList<>();
		list.add(-1);
		list.add(-1);
		res.add(list);
		list = new ArrayList<>();
		list.add(-1);
		list.add(-1);
		res.add(list);
		list = new ArrayList<>();
		list.add(-1);
		list.add(-1);
		res.add(list);
		System.out.println(res);
		System.out.println(Inorder(res));
		List<Integer> queries = new ArrayList<>();
		queries.add(2);
		queries.add(4);
		swapNodes(res, queries);

	}
	
	public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
	    // Write your code here
		List<List<Integer>> res = new ArrayList<List<Integer>>();	
		for(int i=0;i<queries.size();i++){
			res.add(Inorder(swapAtDepth(indexes, queries.get(i))));
		}
		System.out.println(res);
		return res;

	    }
	
	public static List<List<Integer>> swapAtDepth(List<List<Integer>> indexes, int d){
		int depth = 1;
		int i = 0;
		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> q = new LinkedList<>();
		queue.offer(0);
		while(!queue.isEmpty() || !q.isEmpty()){
			if(queue.isEmpty()){
				queue = q;	
				depth++;
				q=new LinkedList<>();
			}else{
				i = queue.poll();
				if(i>-1){
					if(depth%d==0){
						int left = indexes.get(i).get(0)-1;
						int right = indexes.get(i).get(1)-1;
						q.offer(right);
						q.offer(left);	
						indexes.get(i).set(0, right+1);
						indexes.get(i).set(1, left+1);
						System.out.println(Inorder(indexes));
					}else{
						q.offer(indexes.get(i).get(0)-1);
						q.offer(indexes.get(i).get(1)-1);
					}	
				}	
			}
							
		}
		return indexes;
		
	}
	
	public static List<Integer> Inorder(List<List<Integer>> tree){
		List<Integer> inorderTree = new ArrayList<>();
		Stack<Integer> stack = new Stack<>();
		stack.push(0);		
		int curr = stack.peek();		
		while(!stack.isEmpty()){
			if(curr>-1){
				curr = tree.get(curr).get(0)-1;
				if(curr>-1)
					stack.push((curr));
			}else{
				curr = stack.pop();
				inorderTree.add((curr+1));
				curr = tree.get(curr).get(1)-1;
				if(curr>-1)
					stack.push((curr));
			}
		}
		
		return inorderTree;
	}

}
