package com.vikrant.java.essentials.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Paytm {
	
	public static void main(String[] args){	
		String str1 = "{[()]}";
		String str2 = "{([)]}";
		System.out.println(checkExpression(str1.toCharArray()));
		System.out.println(checkExpression(str2.toCharArray()));
		System.out.println(reverseFloat(13.7567, 4));
		
		String[] arr = {"rajat", "raj", "rajkumar", "rajkishor"};
		System.out.println("common prefix is: "+commonPrefix(arr));
		
		
	}
		
		public static String commonPrefix(String[] arr){
			String common = arr[0];
			for(int i=1;i<arr.length && common.length()>0;i++){
				int j=0;				
				while(j<arr[i].length() && j<common.length()
						){
					if(common.charAt(j)==arr[i].charAt(j))
						j++;	
					else
						break;
				}
				common = common.substring(0, j);
			}
			
			return common;
		}
		
		public static boolean checkExpression(char[] arr){
			Stack<Character> st = new Stack<>();
			for(int i=0;i<arr.length;i++){		
				if(!st.isEmpty() && st.peek()=='[' && arr[i]==']'){
					st.pop();
				}else
				if(!st.isEmpty() && st.peek()=='(' && arr[i]==')'){
					st.pop();
				} else if(!st.isEmpty() && st.peek()=='{' && arr[i]=='}'){
					st.pop();
				}else{
					st.push(arr[i]);
				}
			}
			
			if(st.isEmpty())
				return true;
			else
				return false;
			
		}
		
		public static double reverseFloat(double num, int n){			
			long sum = 0;
			int len=0;
			int temp = n;
			while(n>0){
				num = num*10;
				n--;
			}			
			long number = (long) num;
			while(number>=1){
				sum = ((sum*10) + number%10);
				number = number/10;
				len++;
			}
			return sum/Math.pow(10, len-temp);
		}

}
