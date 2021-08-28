package com.vikrant.essentials.hackerrank;

import java.util.HashMap;
import java.util.Map;

import com.vikrant.essentials.hackerrank.Solution.DoublyLinkedListNode;

public class LinkedList1 {

	static class SinglyLinkedListNode {
		int data;
		SinglyLinkedListNode next;

		SinglyLinkedListNode(int data) {
			this.data = data;
		}
	}

	static class DoublyLinkedListNode {
		public int data;
		public DoublyLinkedListNode next;
		public DoublyLinkedListNode prev;

		public DoublyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
			this.prev = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(data);
		if (position == 0) {
			node.next = llist;
			return node;
		} else {
			SinglyLinkedListNode curr = llist;
			while (position > 1) {
				curr = curr.next;
				position--;
			}
			SinglyLinkedListNode temp = curr.next;
			curr.next = node;
			node.next = temp;
			return llist;
		}
	}

	public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
		DoublyLinkedListNode node = new DoublyLinkedListNode(data);
		if (llist == null) 
			return node;
		else if(llist.data>=data){
			node.next=llist;
			llist.prev=node;
			return node;
		}else{		
			DoublyLinkedListNode curr = llist;
			while(curr.next!=null && curr.next.data<data){
				curr = curr.next;
			}
			if(curr.next==null){
				curr.next=node;
				node.prev=curr;
			}else{
				DoublyLinkedListNode temp = curr.next;
				curr.next=node;
				node.prev=curr;
				node.next=temp;
				temp.prev=node;				
			}
			return llist;
		}
	}
	
	public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
	    while(llist!=null){
	    	DoublyLinkedListNode temp = llist.prev;
	    	llist.prev = llist.next;
	    	llist.next=temp;
	    	llist=llist.next;
	    }
		
		return llist;
	 }
	
	static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		while(head1!=null){
			while(head2!=null){
				if(head1.data==head2.data && head1.next==head2.next){
					return head1.data;
				}
				head2=head2.next;
			}
			head1=head1.next;
		}
		return -1;
    }
	
	boolean hasCycle(Node head) {
		Map<Node, Integer> map = new HashMap<>();
		while(head!=null){
			if(map.containsKey(head)){
				return true;
			}else{
				map.put(head, 1);
			}
		}
		return false;
	}
}
