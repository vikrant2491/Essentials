package com.vikrant.essentials.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsInAString {

	public static void main(String[] args) {
		System.out.println(countAnagrams("abba"));
	}
	
	public static int countAnagrams(String string){
		int count = 0;
		Map<String, Integer> subs = getSubstrings(string);
		List<String> keys = new ArrayList<String>();
		keys.addAll(subs.keySet());
		for(int i=0;i<keys.size();i++){
			String ss = keys.get(i);
			if(subs.get(ss)>1){
				Integer x = subs.get(ss);
				count += (x*(x-1))/2;
			}
			for(int j=i+1;j<keys.size();j++){
				String str = keys.get(j);				
					if(ss.length()==str.length()){
						if(isAnagram(str, ss)){
							System.out.println(ss+" "+str);
							count += subs.get(str)*subs.get(ss);
						}
					}
			}
		}
		return count;
	}
	
	public static Map<String, Integer> getSubstrings(String str){
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
		System.out.println(subStrings);
		return subStrings;
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
