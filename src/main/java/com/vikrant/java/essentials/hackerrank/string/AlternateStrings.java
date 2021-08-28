package com.vikrant.java.essentials.hackerrank.string;

public class AlternateStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int alternateString(String str){
		int count = 0;
		char prev, current;
		char[] arr = str.toCharArray();
		prev = arr[0];
		for(int i=1;i<arr.length;i++){
			current = arr[i];
			if(prev==current)
				count++;
			else
				prev = current;
		}
		
		return count;
	}

}
