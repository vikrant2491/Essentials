package com.vikrant.java.essentials.base;

public class Child extends Parent {
	
	public Child(){		
		System.out.println("Child constructor");
	}
	
	public static void print(){
		System.out.println("Child print");
//		return this;
	}
	
	public void print(int a){
		System.out.println("Child print with a"+a);
	}
	
	public void display(){};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent c = new Child();
		Child.print();
		Parent.print();
		c.print(1);
	}

}
