package com.vikrant.java.essentials.base;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(checkPrime(num));
	}

	public static boolean checkPrime(int n) {
		boolean status = true;
		if(n<2)
			return false;
		else if(n==2)
			return true;
		
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				status = false;
				break;
			}
			else
				status = true;
		}
		return status;
	}

}
