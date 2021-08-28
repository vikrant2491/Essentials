package com.vikrant.java.essentials.hackerrank.string;

import java.util.HashMap;
import java.util.Map;

public class MakeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int deleteForAnagram(String str1, String str2){
		Map<Character, Integer> m1 = new HashMap<>();
		int count =0;
		for(int i=97;i<124;i++){
			m1.put((char)i, 0);
		}
		for(Character c: str1.toCharArray()){
			m1.put(c, m1.get(c)+1);
		}
		for(Character c: str1.toCharArray()){
			m1.put(c, m1.get(c)-1);
		}
		for(Character c: m1.keySet()){
			count += Math.abs(m1.get(c));
		}
		
		
		return count;
	}

}
