package com.vikrant.essentials.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Cars {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Car> list = new ArrayList<Car>();
		Car c1 = new Car(2020, "BWagonR");
		Car c2 = new Car(2021, "CWagonR1");
		Car c3 = new Car(2020, "AWagonR2");
		Car c4 = new Car(2020, "DWagonR3");
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
//		list.sort(Comparator.comparing(Car::name).);
		Collections.sort(list);
		for(Car c: list){
			System.out.println(c.name+" "+c.year);
		}

	}

}

class Car implements Comparable<Car>{	
	String name;
	int year;
	
	public Car(){
		
	}
	
	public Car(int year, String name){
		this.name = name;
		this.year = year;
	}
	
	@Override
	public int compareTo(Car o2) {
		if(this.year<o2.year)
			return -1;
		else if(this.year>o2.year){
			return 1;
		}else{
			return this.name.compareToIgnoreCase(o2.name);
		}
	}
}
