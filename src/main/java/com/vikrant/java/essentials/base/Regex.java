package com.vikrant.java.essentials.base;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc xyz \nabc abcd";
		str.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
		for(String s: str.split("abc{3}")){
			System.out.println(s);
		}
	}
	
	

}
