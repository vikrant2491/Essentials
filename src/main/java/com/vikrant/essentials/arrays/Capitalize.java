package com.vikrant.essentials.arrays;

public class Capitalize {
	
	public static void main(String[] args){
		String str = "my name is Vikrant";
		System.out.println(capitalizeWords(str));
	}
	
	private static String capitalizeWords(String s) {
	    String[] arr = s.split(" ");
	    StringBuilder sb = new StringBuilder();
	    for(int i=0;i<arr.length;i++){  
	    String str = arr[i];
	    str = (str.split(""))[0].toUpperCase()+str.substring(1, str.length());
	    arr[i] = str;
	    }
	    for(int i=0;i<arr.length;i++){
	    	sb.append(arr[i]);
	    	sb.append(" ");
	    }
	    return sb.toString();
	}

}
