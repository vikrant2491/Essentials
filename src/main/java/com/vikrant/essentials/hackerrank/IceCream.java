package com.vikrant.essentials.hackerrank;

import java.util.Hashtable;
import java.util.List;

public class IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void whatFlavors(List<Integer> cost, int money) {
		Hashtable<Integer, Integer> table = new Hashtable<>();
		boolean flag = false;
		for(int i=0;i<cost.size() && !flag;i++){
			if(table.containsKey(cost.get(i))){
				if(money == 2*cost.get(i)){
					System.out.println(table.get(cost.get(i))+" "+i);
					flag = true;
				}else{
					table.remove(cost.get(i));
				}
					
			}else{
				table.put(cost.get(i), i);
			}
		}
		
		for(int key: table.keySet()){
			int elem = money - key;
			if(table.containsKey(elem)){
				System.out.println(table.get(key)+" "+table.get(elem));
			}
		}
		
	}
	
	

}
