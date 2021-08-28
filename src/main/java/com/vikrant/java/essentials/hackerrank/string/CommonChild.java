package com.vikrant.java.essentials.hackerrank.string;

public class CommonChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(commonChildMaxLength("WEWOUCUIDGCGTRMEZEPXZFEJWISRSBBSYXAYDFEJJDLEBVHHKS", 
				"FDAGCXGKCTKWNECHMRXZWMLRYUCOCZHJRRJBOAJOQJZZVUYXIC"));

	}
	
	public static int commonChildMaxLength(String s1, String s2){
		int maxLength = 0;
		for(int k=0;k<s1.length();k++){
			int count = 0;
			int pointer = -1;
			for(int i=k;i<s1.length();i++){
				int j = pointer+1;
				while(j<s1.length()){
					if(s1.charAt(i)==s2.charAt(j)){
						count++;
						pointer = j;
						break;
					}
					j++;
				}
				
			}
			if(count>maxLength)
				maxLength=count;
			
		}
		
		return maxLength;
	}

}
