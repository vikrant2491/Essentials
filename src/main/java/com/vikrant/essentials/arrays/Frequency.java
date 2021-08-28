package com.vikrant.essentials.arrays;

public class Frequency{
	
	public static void main(String[] args){
		getFreq("abcacba");
	}
	
	public static void getFreq(String str){
		int[] arr = new int[27];
		
		for(int i=0;i<str.length();i++){
			arr[Integer.valueOf(str.charAt(i))-97]++;
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
//				System.out.println((char)(i+97)+" "+arr[i]);
				System.out.println((char)(i+97));
			}
		}
	}
}
