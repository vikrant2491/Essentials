package com.vikrant.essentials.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AAABBCCeeeeeDDABB";
//		findOccurence(str);
		frquency(str);


	}
	
	public static void findOccurence(String str){
		char prev = str.charAt(0);
		StringBuilder str1 = new StringBuilder();
		int count = 1;
		for(int i=1;i<str.length();i++){
			char curr = str.charAt(i);
			if(prev!=curr){
				str1.append(prev);
				str1.append(count);	
				count=1;
			}else{
				count++;
			}
			prev = curr;
			
		}
		System.out.println(str1);
		
	}
	
	public static void frquency(String str){
		Map<Character, Integer> freq = new HashMap<Character, Integer>();
		for(char c: str.toCharArray()){
			if(freq.containsKey(c)){
				freq.put(c, freq.get(c)+1);
			}else{
				freq.put(c, 1);
			}
		}
		List<f1> res = new ArrayList<>();
		comp1 c = new comp1();
		for(char c1: freq.keySet()){
//			System.out.println(c+" "+freq.get(c));
			f1 ob = new f1(c1, freq.get(c1));
			res.add(ob);
		}
		
		Collections.sort(res, c);
		for(f1 elem: res){
			System.out.println(elem.key+" "+elem.val);
		}
		
	}
	
	

}

class f1{
	Character key;
	Integer val;
	
	public f1(char key, int val){
		this.key = key;
		this.val = val;
		
	}
	
	
}

class comp1 implements Comparator<f1>{

	@Override
	public int compare(f1 o1, f1 o2) {
		if(o1.val>o2.val){
			return 1;
		}else
		if(o1.val<o2.val){
			return -1;
		}else{
			return o1.key.compareTo(o2.key);
		}
		
	}
	
}