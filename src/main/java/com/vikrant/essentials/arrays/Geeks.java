package com.vikrant.essentials.arrays;

import java.util.Arrays;
import java.util.List;

public class Geeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(factorial(1));
//		reverseString("vikrant");
//		swap(3, 4);
//		containsVowels("this");
//		System.out.println(isPrime(2));
		fibonacci(10);
		System.out.println(fibonacciRecursion(10));

	}
	
	public static void fibonacci(int n){
		Integer[] arr = new Integer[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<arr.length;i++){
			arr[i] = arr[i-1]+arr[i-2];
		}
		System.out.println(Arrays.asList(arr));
	}
	
	public static int fibonacciRecursion(int n){
		if (n <= 1)
			return n;
		return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
	}
	
	public static boolean isPrime(int n){
		boolean status = true;
		if(n<2){
			return false;
		}
		if(n==2 || n==3){
			return true;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				status = false;
				break;
			}
		}
		return status;
	}
	
	public static int factorial(int n){
		int fact = 1;
		while(n>1){
			fact *= n;
			n--;
		}
		return fact;
	}
	
	public static void reverseString(String str){
		StringBuilder sb = new StringBuilder();
		String st = "";
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
			st = st.concat(String.valueOf(str.charAt(i)));			
		}
		System.out.println(sb);
		System.out.println(st);
	}
	
	public static void swap(int a, int b){
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void containsVowels(String str){
		if(str.matches(".*[aeiou].*")){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}

}
