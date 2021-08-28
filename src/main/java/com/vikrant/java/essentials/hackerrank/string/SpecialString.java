package com.vikrant.java.essentials.hackerrank.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SpecialString {

	public static void main(String[] args) {
		
		System.out.println(substrCount(7, "abcbaba"));
	}
	
	public static long getCount(int n, String str){
		long count = 0;
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				if(i==j)
					count++;
				else{
					char expected = arr[i];
					boolean status = true;
					for(int k=i;k<=j;k++){
						if(arr[k]!=expected){
							if((j-i+1)%2!=0 && k==(j+i)/2){
								continue;
							}else{
								status = false;
								break;
							}					
						}
					}
					if(status)
						count++;
				}
			}
		}
		return count;
	}
	
	public static long specialStrings(int n, String s){
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		long count = 0;
		for(char c: s.toCharArray()){
			if(frequency.containsKey(c))
				frequency.put(c, frequency.get(c)+1);
			else
				frequency.put(c, 1);
		}
		for(char c: s.toCharArray()){
			//
//			s.cha
//			count += (2^frequency.get(c))-1;
		}
		
		
		return 0;
	}
	
	static long substrCount(int n, String s) {
	    s = s + " ";
	    ArrayList<Point> l = new ArrayList<Point>();
	    long count = 1;
	    char ch = s.charAt(0);
	    for(int i = 1; i <= n ; i++) {
	        if(ch == s.charAt(i))
	            count++;
	        else {
	            l.add(new Point(ch, count));
	            count = 1;
	            ch = s.charAt(i);
	        }
	    }
	    count = 0;
	    if(l.size() >= 3) {   
	        Iterator<Point> itr = l.iterator();
	        Point prev, curr, next;
	        curr = (Point)itr.next();
	        next = (Point)itr.next();
	        count = (curr.count * (curr.count + 1)) / 2;
	        for(int i = 1; i < l.size() - 1; i++) {
	            prev = curr;
	            curr = next;
	            next = itr.next();
	            count += (curr.count * (curr.count + 1)) / 2;
	            if(prev.key == next.key && curr.count == 1)
	                count += prev.count > next.count ? next.count : prev.count;
	        }
	        count += (next.count * (next.count + 1)) / 2;
	    } else {
	        for(Point curr:l){
	            count += (curr.count * (curr.count + 1)) / 2;
	        }
	    }
	    return count;
	}
	
	static class Point {
	    public char key;
	    public long count;

	    public Point(char x, long y) {
	        key = x;
	        count = y;
	    }
	}
	
	

}
