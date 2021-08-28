package com.vikrant.essentials.hackerrank;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

public class Tree1 {

	public static void main(String[] args) {

	}

	public static int height(Node root) {
		int height=0;
		if (root == null) {
			return 0;
		} else {
			Queue<Node> queue = new LinkedList<>();
			queue.offer(root);
			queue.offer(null);
			while (!queue.isEmpty()) {
				Node curr = queue.poll();
				if (curr == null && !queue.isEmpty()) {					
					queue.offer(null);
					height++;
				} else if(curr!=null){
					if (curr.left != null) {
						queue.offer(curr.left);
					}
					if (curr.right != null) {
						queue.offer(curr.right);
					}
				}
			}
		}

		return height;

	}
	
	public static int getHeight(Node root){
		if(root==null)
			return -1;
		else{
			int leftH = getHeight(root.left);
			int rightH = getHeight(root.right);
			if(leftH>=rightH){
				return leftH+1;
			}else{
				return rightH+1;
			}
		}
	}
	
	public static Node lca(Node root, int v1, int v2) {
      	// Write your code here.
		if(root.data<v1 && root.data<v2){
			return lca(root.right, v1, v2);
		}else if(root.data>v1 && root.data>v2){
			return lca(root.left, v1, v2);
		}else{
			return root;
		}
    }
	
	boolean checkBST(Node root) {
		boolean status = false;
		if(root==null){
			return true;
		}
		if(root.left!=null){
			if(root.left.data<root.data){
				status = checkBST(root.left);
			}else{
				status = false;
			}
		}
		
		if(root.right!=null && status){
			if(root.right.data>root.data){
				status = checkBST(root.right);
			}else{
				status = false;
			}
		}
		 
		 
        return status;
    }

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			if (data <= root.data) {
				Node curr = insert(root.left, data);
				root.left = curr;
			} else {
				Node curr = insert(root.right, data);
				root.right = curr;
			}
		}
		return root;
	}

}
