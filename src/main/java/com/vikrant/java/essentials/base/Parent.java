package com.vikrant.java.essentials.base;

public abstract class Parent {
	
	public Parent(){
		System.out.println("Parent constructor");
	}
	
	public Parent(int a){
		System.out.println("Parent A constructor");
	}
	
	public static void print(){
		System.out.println("Parent print");
//		return this;
	}
	
	public void print(int a){
		System.out.println("Parent print with a"+a);
	}
	
	public abstract void display();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
