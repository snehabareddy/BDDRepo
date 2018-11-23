package com.capgemini.bdd;

public class BddDemo {

	public static void main(String[] args) {
		
		System.out.println("Helloo !!");
		int add = sum(4,5);
		System.out.println("sum = "+add);

	}

	private static int sum(int i, int j) {
		return i+j;
	}

}
