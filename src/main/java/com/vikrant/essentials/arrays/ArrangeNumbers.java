package com.vikrant.essentials.arrays;

public class ArrangeNumbers {

	public static void main(String[] args) {
		int a = 123;
		int b = 78901;
		System.out.println(arrange(a, b));
		System.out.println(arrange2(a, b));

	}
	
	public static long arrange2(long a, long b){
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		StringBuilder str = new StringBuilder();
		for(int i=0;i<(a1.length()>b1.length()?a1.length():b1.length());i++){
			if(i<a1.length()){
				str.append(a1.charAt(i));				
			}
			if(i<b1.length()){
				str.append(b1.charAt(i));				
			}
		}
		return Long.valueOf(str.toString());
	}
	
	public static long arrange(long a, long b){
		//Converting given values to String so that they can be iterated easily
		String a1 = String.valueOf(a);
		String b1 = String.valueOf(b);
		StringBuilder str = new StringBuilder();
		int i=0, j=0;	
		
		
		while(i<a1.length() && j<b1.length()){			
			str.append(a1.charAt(i));
			str.append(b1.charAt(j));
			i++;
			j++;
		}
		while(i<a1.length()){
			str.append(a1.charAt(i));
			i++;
		}
		while(j<b1.length()){
			str.append(b1.charAt(j));
			j++;
		}
		
		return Long.valueOf(str.toString());
		
	}

}
