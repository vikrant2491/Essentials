package com.vikrant.java.essentials.base;

public class AveargePrize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double finalPrize = 0.4;
		double initialPrize = 0.62;
		double initialQuantity = 702;		
		double secondPrize = 0.33;
		
		double secQuantity = average(finalPrize, initialPrize, secondPrize, initialQuantity);
		
		System.out.println(secQuantity);
		System.out.println(secondPrize * secQuantity);

	}
	
	public static double average(double finalPrize, double initialPrize, double secondPrize, double initialQuantity){
		return ((initialPrize-finalPrize)/(finalPrize-secondPrize) * initialQuantity);
		
		
	}

}
