package com.vikrant.java.essentials.base;

import com.vikrant.java.essentials.base.BasicQuestions.Node;

public class BasicQuestions2 {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(5));
		System.out.println(factorialRecursion(5));
		for(int i=1;i<=5;i++){
			System.out.print(fibonnaci(i)+" ");
		}
		System.out.println();
		fibbonnaciSeries(5);
		System.out.println();
		System.out.println(sumOfPrimes(5));
		System.out.println(binaryToDecimal(011));
		
		Node root = new Node(1);
		root.next = new Node(3);
		root.next.next = new Node(5);
		root.next.next.next = new Node(7);
		
		Node root1 = new Node(2);
		root1.next = new Node(4);
		root1.next.next = new Node(6);
		root1.next.next.next = new Node(8);
		
		displayLinkedList(root);
		displayLinkedList(root1);
		Node root2 = mergeLL(root, root1);
		displayLinkedList(root2);
		displayLinkedList(reverseLL(root2));
		

	}
	
	public static Node mergeLL(Node head1, Node head2){
		Node h = null;
		Node head=null;
		while(head1!=null && head2!=null){
			if(head1.data>head2.data){
				if(h==null){
					h = head2;
					head = h;
				}else{
					h.next = head2;
					h=h.next;
				}				
				head2 = head2.next;
			}else{
				if(h==null){
					h = head1;
					head = h;
				}else{
					h.next = head1;
					h=h.next;
				}	
				head1 = head1.next;
			}
		}
		while(head1!=null){
			h.next = head1;
			h=h.next;
			head1 = head1.next;
		}
		while(head2!=null){
			h.next = head2;
			h=h.next;
			head2 = head2.next;
		}
		return head;
		
	}
	
	public static Node reverseLL(Node head){
		Node prev = null;
		while(head!=null){
			Node temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}
	
	public static void displayLinkedList(Node head){
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static int binaryToDecimal(int n){
		int decimal = 0;
		int factor = 1;
		while(n>0){
			int i = n%10;
			n = n/10;
			decimal = decimal + (factor * i);
			factor *= 2;
		}
		return decimal;
	}
	
	public static int sumOfPrimes(int n){
		int num = 2;
		int sum = 0;
		while(n>0){
			if(isPrime(num)){
				sum += num;
				n--;
			}
			num++;
		}
		return sum;
	}
	
	public static boolean isPrime(int n){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int n){
		int fact = 1;
		while(n>0){
			fact *= n;
			n--;
		}
		return fact;
	}
	
	public static int factorialRecursion(int n){
		if(n>0)
			return n * factorial(n-1);
		else
			return 1;
	}
	
	public static int fibonnaci(int n){
		if(n==1){
			return 0;
		}else if(n==2){
			return 1;
		}else{
			return fibonnaci(n-2)+fibonnaci(n-1);
		}
	}
	
	public static void fibbonnaciSeries(int n){
		if(n>=1)
			System.out.print(0+" ");
		if(n>=2){
			System.out.print(1+" ");
		}
		if(n>2){
			int a = 0;
			int b = 1;
			for(int i=3;i<=n;i++){
				System.out.print(a+b+" ");
				b = a+b;
				a = b-a;				
			}
		}
	}

}
