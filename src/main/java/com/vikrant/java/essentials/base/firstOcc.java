package com.vikrant.java.essentials.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class firstOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstOccurence("abZabc"));
	}
	
	public static char firstOccurence(String str){
		char[] arr = str.toCharArray();
		char c=' ';
		for(int i=0;i<arr.length;i++){
			boolean flag = true;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					flag=false;
					break;
				}	
			}
			if(flag){
				c = arr[i];
				break;
			}
		}
		
		
		return c;
	}
}
