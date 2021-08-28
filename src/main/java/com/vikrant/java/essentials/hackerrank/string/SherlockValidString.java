package com.vikrant.java.essentials.hackerrank.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SherlockValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("aabbcd"));
	}
	
	public static String isValid(String s){
		String result="YES";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(char c: s.toCharArray()){
			if(m.containsKey(c))
				m.put(c, m.get(c)+1);
			else
				m.put(c, 1);
		}
		System.out.println(m);
		
		int validFreq1 = 0, freq1=0;
		int validFreq2 = 0, freq2=0;
		for(char c: m.keySet()){
				int freq = m.get(c);
				if(validFreq1==0){
					validFreq1 = freq;
					freq1++;
				}
				else if(freq!=validFreq1 && validFreq2==0){
					validFreq2 = freq;
					freq2++;
				}else if(freq!=validFreq1 && freq != validFreq2){
					result = "NO";
					break;
				}else if(freq==validFreq1){
					freq1++;
				}else if(freq==validFreq2){
					freq2++;
				}
			}
		System.out.println(validFreq1+" "+freq1);
		System.out.println(validFreq2+" "+freq2);
		
		if(validFreq1!=0 && validFreq2!=0 && result.equals("YES") && !((validFreq1==1 && freq1 ==1) || (validFreq2==1 && freq2 ==1))){
			if(Math.abs(validFreq1-validFreq2)>1){
				result = "NO";
			}else{
				if(validFreq1>validFreq2){
					if(freq1!=1)
						result="NO";
				}else{
					if(freq2!=1)
						result="NO";
				}
			}
			
		}
			
		
		
		return result;
		
	}

}
