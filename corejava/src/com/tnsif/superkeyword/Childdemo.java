package com.tnsif.superkeyword;

public class Childdemo extends Parentdemo {
int a=7;
	
	void drink() {
		System.out.println("boost");
	}
	
	void display() {

		drink();
		super.drink();
		
	}
	
	public static void main(String[] args) {
		Childdemo d=new Childdemo();
		d.display();

	}
}

