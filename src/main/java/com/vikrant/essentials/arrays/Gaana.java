package com.vikrant.essentials.arrays;

import java.util.HashMap;
import java.util.Map;

public class Gaana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="aaaabbbbasssbbbssbbbcccddcc"; 
		//a4b4a1s3b3s2b3c3d2c2
//		continuousFreq(a);
		
		char[] ch= {'a','c','q','w','f','w','d','i','u','t','w','a','z','x','a','b'};
		frequency(ch);
		
	}
	
	public static void frequency(char[] arr){
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i], map.get(arr[i])+1);
			}else{
				map.put(arr[i], 1);
			}
		}
		
		for(char c: map.keySet()){
			System.out.println(c+" "+map.get(c));
		}
	}
	
	public static void continuousFreq(String str){
		StringBuilder sb = new StringBuilder();
		char[] chars = str.toCharArray();
		char prev = chars[0];
		int count=1;
		for(int i=1;i<chars.length;i++){
			if(chars[i]==prev){
				count++;
			}else{
				sb.append(prev);
				sb.append(count);
				count=1;
				prev = chars[i];
			}
		}
		sb.append(chars[chars.length-1]);
		sb.append(count);
		
		System.out.println(sb.toString());
		
	}

}
