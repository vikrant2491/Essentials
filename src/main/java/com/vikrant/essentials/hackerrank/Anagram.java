package com.vikrant.essentials.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(isAnagram("abc", "cab"));
		StringJoiner s = new StringJoiner("-");
		s.add("a");
		s.add("b");
		System.out.println(s);
	}
	
	public static boolean isAnagram1(String str1, String str2){
		int maxLength = (str1.length()>str2.length()?str1.length():str2.length()); 
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Map<Character, Integer> str1Map = new HashMap<>();
		Map<Character, Integer> str2Map = new HashMap<>();
		for(int i=0;i<maxLength;i++){
			if(i<str1.length()){
				if(str1Map.containsKey(s1[i]))
					str1Map.put(s1[i], str1Map.get(s1[i])+1);
				else
						str1Map.put(s1[i], 1);				
			}
			if(i<str2.length()){
				if(str2Map.containsKey(s2[i]))
					str2Map.put(s2[i], str2Map.get(s2[i])+1);
				else
						str2Map.put(s2[i], 1);
			}
		}
		
		return str1Map.equals(str2Map);
		
	}
	
	public static boolean isAnagram(String str1, String str2){
		if(str1.length()!=str2.length())
			return false;
		else{
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i])
					return false;
					
			}
			return true;
		}
	}

}
