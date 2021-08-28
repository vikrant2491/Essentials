package com.vikrant.essentials.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class FindSubstrings {

	public static void main(String[] args) {
		
		System.out.println(getSubstrings("abcde"));
		

	}
	
	public static Map getSubstrings(String str){
		Map<String, Integer> subStrings = new HashMap<>();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<=str.length();j++){
				String ss = str.substring(i, j);
				if(subStrings.containsKey(ss))
					subStrings.put(ss, subStrings.get(ss)+1);
				else
					subStrings.put(ss, 1);
			}
		}
		System.out.println(subStrings.size());
		return subStrings;
	}

}
