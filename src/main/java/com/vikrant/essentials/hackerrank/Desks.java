package com.vikrant.essentials.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Desks {

	public static void main(String[] args) {
		double[] centres = {0, 8};
		double[] lengths = {6, 2};
		double d = 2;
		System.out.println("Possible adjacent positions count is: "
				+ ""+maxPositions(2, centres, lengths, d));

	}	
	public static int maxPositions(int N, double[] centres, double[] lengths, double d){
		HashMap<Double, Double> desks = new HashMap<>();
		Set<Double> positions = new HashSet<>();
		for(int i=0;i<N;i++){
			desks.put(centres[i], lengths[i]);
		}
		System.out.println("Desks centre position on x-axis and their lengths "+desks);
		System.out.println("New desk length is: "+d);
		
		Arrays.sort(centres);		
		
		for(int i=0;i<centres.length-1;i++){
			double currentEdge = centres[i]+(desks.get(centres[i])/2);
			System.out.println("current edge "+currentEdge);
			double nextEdge = centres[i+1]-(desks.get(centres[i+1])/2);
			System.out.println("Next edge "+nextEdge);
			if(currentEdge+d<=nextEdge){
				positions.add(currentEdge + (d/2));
			}
			if(nextEdge-d>=currentEdge){
				positions.add(nextEdge-(d/2));
			}
		}		
		System.out.println("possible Positions such that they are adjacent"
				+ " to any of existing desks: ");
		for(double a: positions){
			System.out.println(a);
		}		
		return positions.size();
		}

}
