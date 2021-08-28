package com.vikrant.java.essentials.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BasicQuestions {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// binaryToDecimal(10);
		// System.out.println(sumPrime(10));
		// System.out.println(factorial(5));
		// int[] arr1 = {2, 9, 34, 45};
		// int[] arr2 = {5, 11, 34, 50};
		// mergeTwoArrays(arr1, arr2);
		// fibonnaci(5);
		// for(int i=0;i<5;i++){
		// System.out.print(fibonnaci1(i)+" ");
		// }

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);

		System.out.println(ll);
		Collections.sort(ll, Collections.reverseOrder());
		System.out.println(ll);

		Node root = new Node(1);
		root.next = new Node(3);
		root.next.next = new Node(5);
		root.next.next.next = new Node(7);
		
		Node root1 = new Node(2);
		root1.next = new Node(4);
		root1.next.next = new Node(6);
		root1.next.next.next = new Node(8);

//		displayLinkedList(root);
//		root = reverseLinkedList(root);
//		displayLinkedList(root);
//		root = insertInLinkedList(root, 5);
//		displayLinkedList(root);
//		root = deleteNode(root, 5);
//		displayLinkedList(root);
		displayLinkedList(root);
		displayLinkedList(root1);
		Node root2 = mergeLinkedList(root, root1);
		displayLinkedList(root2);
	}

	public static Node mergeLinkedList(Node head1, Node head2) {
		Node head = null;

		if (head1 == null && head2 == null) {
			return null;
		} else if (head1 == null && head2 != null) {
			head = head2;
		} else if (head2 == null && head1 != null) {
			head = head1;
		} else {
			Node curr=null;
			if(head1.data>head2.data){				
				curr=head2;
				
				head2=head2.next;
				}
			else{
				curr=head1;
				head = curr;
				head1=head1.next;
			}
			
			while (head1 != null && head2 != null) {
				if (head1.data > head2.data) {
					curr.next = head2;
					curr = curr.next;
					head2 = head2.next;
				} else {
					curr.next = head1;
					curr = curr.next;
					head1 = head1.next;
				}
			}
			while (head1 != null) {
				curr.next = head1;
				curr = curr.next;
				head1=head1.next;
			}
			while (head2 != null) {
				curr.next = head2;
				curr = curr.next;
				head2=head2.next;
			}
		}
		return head;
	}

	public static void displayLinkedList(Node root) {
		while (root != null) {
			System.out.print(root.data + " ");
			root = root.next;
		}
		System.out.println();
	}

	public static Node reverseLinkedList(Node root) {
		Node prev = null;
		if (root == null) {
			return root;
		}
		while (root != null) {
			Node temp = root.next;
			root.next = prev;
			prev = root;
			root = temp;
		}

		return prev;
	}

	public static Node insertInLinkedList(Node root, int data) {
		Node node = new Node(data);
		Node head = root;
		if (root == null)
			head = node;
		else {
			while (root.next != null) {
				root = root.next;
			}
			root.next = node;
		}
		return head;
	}

	public static Node deleteNode(Node root, int data) {
		Node head = root;
		if (root == null)
			return null;
		else if (root.data == data) {
			head = root.next;
		} else {
			while (root.next != null && root.next.data != data) {
				root = root.next;
			}
			if (root.next != null)
				root.next = root.next.next;
		}
		return head;
	}

	public static void binaryToDecimal(int binary) {
		int sum = 0;
		int base = 1;
		while (binary > 0) {
			int digit = binary % 10;
			binary = binary / 10;
			sum += digit * base;
			base *= 2;
		}
		System.out.println(sum);
	}

	public static int sumPrime(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		int sum = 0;
		int elem = 2;
		while (n > 0) {
			if (isPrime(elem)) {
				sum += elem;
				primes.add(elem);
				n--;
			}
			elem++;
		}
		System.out.println(primes);
		return sum;
	}

	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		if (n == 2 || n == 3)
			return true;
		else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static int factorial(int n) {
		// if(n==0 ||n==1)
		// return 1;
		// else
		// return n*factorial(n-1);
		// or
		int fact = 1;
		while (n > 0) {
			fact *= n;
			n--;
		}
		return fact;
	}

	public static void mergeTwoArrays(int[] arr1, int[] arr2) {
		int[] finalArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				finalArr[k++] = arr2[j++];
			} else {
				finalArr[k++] = arr1[i++];
			}
		}
		while (i < arr1.length) {
			finalArr[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			finalArr[k++] = arr2[j++];
		}

		for (int x = 0; x < finalArr.length; x++) {
			System.out.print(finalArr[x] + " ");
		}
	}

	public static void fibonnaci(int n) {
		int i = 0;
		int j = 1;
		while (n-- > 0) {
			int sum = i + j;
			System.out.println(i);
			i = j;
			j = sum;
		}
	}

	public static int fibonnaci1(int n) {
		if (n <= 1)
			return n;
		else
			return fibonnaci1(n - 1) + fibonnaci1(n - 2);
	}

}
