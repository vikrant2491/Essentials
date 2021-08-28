package com.vikrant.java.essentials.base;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s1 = new HashSet<>();
		Set<String> s2 = new TreeSet<>();
		Set<String> s3 = new LinkedHashSet<>();
		
		s1.add("B");
		s1.add("D");
		s1.add("A");
		s1.add("A");
		s1.add("C");
		s1.add(null);
		s1.add(null);
		
		s2.add("B");
		s2.add("D");
		s2.add("A");
		s2.add("A");
		s2.add("C");
//		s2.add(null);
		
		s3.add("B");
		s3.add("D");
		s3.add("A");
		s3.add("A");
		s3.add("C");
		s3.add(null);
		s3.add(null);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
	}

}
